package br.edu.unipe.aps2.locadora;

public class Locadora {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Abílio");

        Fita fita1 = new Fita("Matrix", Fita.NORMAL);
        Fita fita2 = new Fita("Toy Story", Fita.INFANTIL);
        Fita fita3 = new Fita("Oppenheimer", Fita.LANCAMENTO);

        cliente.adicionaAluguel(new Aluguel(fita1, 3));
        cliente.adicionaAluguel(new Aluguel(fita2, 4));
        cliente.adicionaAluguel(new Aluguel(fita3, 2));

        System.out.println(cliente.extrato());
    }
}