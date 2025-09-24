package br.edu.unipe.aps2.locadora; 

public class Aluguel {
	private int diasAlugada;
	private Fita fita;
  
	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}
	
	public Fita getFita() {
		return fita;
	}
	
	public int getDiasAlugada() {
		return diasAlugada;
	}
}