package br.edu.figGeometricas;


public class Quadrado{
    
    //Atributos 
    
    public double lado;

	public double area;
	
	//Metódo
	
	public void calcArea1() {

		area = lado * lado;

	}
	
	public double calcArea2() {

		area = lado * lado;

		return area;

	}
	
	public void calcArea3(double l) {

		lado = l ;

		calcArea2();	

	}
	
	public void listaAtributos() {

		

		System.out.println("O valor do lado é: " + lado);

		System.out.println("O valor da área é: " + area);

	}
	
}
