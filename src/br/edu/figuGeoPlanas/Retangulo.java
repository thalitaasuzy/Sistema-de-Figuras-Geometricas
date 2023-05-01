package br.edu.figuGeoPlanas;

public class Retangulo {

//Atributos 
    
    private double ladoA;
    
    private double ladoB;

    private double area;
	
//Método
	
    private void calcArea1() {

		area = ladoA * ladoB;

	}
	
	public void listaAtributos() {

	
		System.out.println("===========RETÂNGULO===========");
		
		System.out.println("O valor do lado A é " + getLadoA() + "cm.");

		System.out.println("O valor do lado B é " + getLadoB()  + "cm.");
		
		System.out.println("O valor da área é " + getArea() + "cm²." );

	}
	
	//Métodos Especiais
	
	public double getLadoA() {
		return this.ladoA;
	}
	
	public void setLadoA(double lA) {
		this.ladoA = lA;
	}
	
	public double getLadoB() {
		return this.ladoB;
	}
	
	public void setLadoB(double lB) {
		this.ladoB = lB;
	}
	
	public double getArea() {
		calcArea1();
		return this.area;
	}
	
	
}
