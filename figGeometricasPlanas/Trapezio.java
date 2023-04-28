package br.edu.figGeometricas;

public class Trapezio{
    
    //Atributos 
    
    double bMaior;
    
    double bMenor;
    
    double altura;
    
    //Metódos
    
    public void calcArea1() {

		area = (bMaior + bMenor) * altura / 2
		
	 public void calcArea2() {

	    area = (bMaior + bMenor) * altura / 2
		
		return area
		
	public void calcArea3(double B, double b, double h) {
	    
	    bMaior = B;
	    
	    bMenor = b;
	    
	    altura = h;

		calcArea2();	
	    
	}
	
	public void listarAtributos() {
		
		System.out.println("O valor da base maior é  " + bMaior + "cm.");

		System.out.println("O valor da base menor é " + bMenor  + "cm.");
		
		System.out.println("O valor da área é " + area + "cm." )
		

    }
}
