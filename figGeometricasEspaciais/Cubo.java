package br.edu.figuGeometricasEspaciais;

public class Cubo{
    
//Atributos
    
    private double lado;
    private double areaTotal;
    private double areaLateral;
    private double volume;
    
//Metódos
    
    public double calcAreaTotal() {
        
        areaTotal = 6 * (lado * lado);
    }
    
    
    private double calcAreaLateral() {
        
        areaLateral = 4 * (lado * lado);
        
    }
    
    public double volume() {
        
        volume = lado * lado * lado; 
    }
	
    public double getLado() {
        return this.lado;
    }
    
    public double setLado(double l){
        this.lado = l;
    }
    
    
    public double listarAtributos() {
        
        System.out.println("===========CUBO===========");
        
        System.out.println("O valor do lado é " + getLado() + "cm.");

	System.out.println("O valor da área lateral é " + areaLateral + "cm².");
		
	System.out.println("O valor da área total é " + areaTotal + "cm².");
		
	System.out.println("O valor do volume é: " + volume + "cm³.");
    }
    
  
}



