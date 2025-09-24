package br.edu.unipe.aps2.locadora;

import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + "\n";

        for (Aluguel aluguel : alugueis) {
            // Refatoração: cálculo do valor delegada para Fita
            double valorCorrente = aluguel.getFita().calcularValor(aluguel.getDiasAlugada());

            pontosDeAlugadorFrequente++;
            if ((aluguel.getFita().getCodigoDePreco() == Fita.LANCAMENTO) 
                && aluguel.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            resultado += "\t" + aluguel.getFita().getTitulo() + "\t" + valorCorrente + "\n";
            valorTotal += valorCorrente;
        }

        resultado += "Valor total devido: " + valorTotal + "\n";
        resultado += "Você ganhou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        return resultado;
    }
}

/* Justificativa:
Agora, o cálculo do valor do aluguel está encapsulado na classe Fita, melhorando o design orientado a objetos e facilitando futuras manutenções.*/