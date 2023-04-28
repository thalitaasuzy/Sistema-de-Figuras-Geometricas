package br.edu.figGeometricas;



public class Retangulo{
    
    //Atributos 
    
    public double base;
    
    public double altura;

	public double area;
	
	//Metódo
	
	public void calcArea1() {

		area = base * altura;

	}
	
	public double calcArea2() {

		area = base * altura;

		return area;

	}
	
	public void calcArea3(double b, double h) {
	    
	    base = b;
	    altura = h

		calcArea2();	

	}
	
	public void listaAtributos() {

		

		System.out.println("O valor da base é " + base + "cm.");

		System.out.println("O valor da altura é " + altura  + "cm.");
		
		System.out.println("O valor da área é " + area + "cm." )

	}
	
}
