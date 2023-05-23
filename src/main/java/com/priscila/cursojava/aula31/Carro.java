package com.priscila.cursojava.aula31;

public class Carro {

	public String marca;
	String modelo; //modificador de acesso default
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustive(double km){
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km){
		
		return this.divideKMPorConsumoCombustive(km);
	}

	//modificador de acesso é uma palavra reservada que indica o nível de acesso de um atributo, método ou classe
}
