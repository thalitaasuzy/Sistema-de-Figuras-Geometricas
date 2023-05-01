package br.edu.figuGeoPlanas;

public class Quadrado {
 
//Atributos 
    
    private double lado;

	private double area;
	
//Métodos
	
	private void calcArea1() {

		area = lado * lado;

	}
	
	public void listaAtributos() {

		System.out.println("===========QUADRADO===========");
		
		System.out.println("O valor do lado é " + getLado() + "cm.");

		System.out.println("O valor da área é " + getArea() + "cm².");

	}
	
//Métodos Especiais
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double l) {
		this.lado = l;
	}
	
	public double getArea() {
		calcArea1();
		return this.area;
	}
	
}
