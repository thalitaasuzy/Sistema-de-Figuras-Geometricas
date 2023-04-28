package br.edu.figGeometricas;



public class Triangulo {

	

	public double base;

	public double altura;

	public double area;



	

	public void calcArea1() {

		area = (base * altura) / 2;

	}

	

	public double calcArea2() {

		

		area = (base * altura) / 2;

		return area;

	}

	

	public void calcArea3(double b, double h) {

		

		base = b;

		altura = h;

		

		calcArea2();	

	}

	

	public void listaAtributos() {

		

		System.out.println("O valor da base é: " + base);

		System.out.println("O valor da altura é: " + altura);

		System.out.println("O valor da área é: " + area);

	}

	

	

}



