package br.edu.figuGeoPlanas;

public class Circulo {
	 
//Atributos
    private double raio; 
    
    private double area;
    
    private double diametro;
    
    private double PI = 3.14;
    
    
//Metódos
    
    private void calcArea1() {
        
        area = PI * (raio * raio);
    }
    
	public void listaAtributos() {
		
		System.out.println("===========CIRCULO===========");

		System.out.println("O valor do raio é " + getRaio() + "cm.");
		
		System.out.println("O valor do diâmetro é " + getDiametro() + "cm.");

		System.out.println("O valor da área é  " + getArea() + "cm².");

	}

	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double r) {
		this.raio = r;
	}
	
	public double getArea() {
		calcArea1();
		return this.area;
	}
	
	public double getDiametro() {
		this.diametro = 2 * raio;
		return this.diametro;
	}
	
	public double getPI() {
		return this.PI;
	}
	
	

	
	
}
