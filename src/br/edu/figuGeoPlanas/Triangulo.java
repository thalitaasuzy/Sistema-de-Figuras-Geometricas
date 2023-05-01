package br.edu.figuGeoPlanas;

public class Triangulo {
	
//Atributos 
	
	private double base;

	private double altura;

	private double area;

//Métodos

	private void calcArea1() {

		area = (base * altura) / 2;

	}

	public void listaAtributos() {

		System.out.println("===========TRIÂNGULO===========");
		
		System.out.println("O valor da base é " + getBase() + "cm.");

		System.out.println("O valor da altura é " + getAltura() + "cm.");

		System.out.println("O valor da área é " + getArea() + "cm².");

	}
	
//Métodos especiais
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double b) {
		this.base = b;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double a) {
		this.altura = a;
	}
	
	public double getArea() {
		calcArea1();
		return this.area;
	}
	
}

