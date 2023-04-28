package br.edu.figurasGeometricasEspaciais;

public class Cubo{
    
    //Atributos
    
    double lado;
    double areaLateral;
    double areaTotal;
    double volume;
    
    //Metódos
    
    public double calcAreaLateral() {
        
        areaLateral = 4 * (lado * lado);
        
    }
    
    public double calcAreaTotal() {
        
        areaTotal = 6 * (lado * lado);
    }
    
    public double volume() {
        
        volume = lado * lado * lado; 
    }
    
    public double listarAtributos() {
        
        System.out.println("O valor do lado é: " + lado);

		System.out.println("O valor da área lateral é " + areaLateral + "cm².");
		
		System.out.println("O valor da área total é " + areaTotal + "cm².");
		
		System.out.println("O valor do volume é: " + volume + "cm³.");
    }
}





