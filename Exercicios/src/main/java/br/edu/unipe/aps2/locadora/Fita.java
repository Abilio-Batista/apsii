package br.edu.unipe.aps2.locadora;

public class Fita {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;

    private String titulo;
    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(int codPreco) {
        this.codigoDePreco = codPreco;
    }

    // NOVO MÉTODO
    public double calcularValor(int diasAlugada) {
        double valor = 0;
        switch (codigoDePreco) {
            case NORMAL:
                valor += 2;
                if (diasAlugada > 2)
                    valor += (diasAlugada - 2) * 1.5;
                break;
            case LANCAMENTO:
                valor += diasAlugada * 3;
                break;
            case INFANTIL:
                valor += 1.5;
                if (diasAlugada > 3)
                    valor += (diasAlugada - 3) * 1.5;
                break;
        }
        return valor;
    }
}

/*Justificativa:
A responsabilidade de calcular o valor do aluguel de uma fita deve ser da própria fita, não da classe Cliente. Isso melhora o encapsulamento e facilita a manutenção.
 */