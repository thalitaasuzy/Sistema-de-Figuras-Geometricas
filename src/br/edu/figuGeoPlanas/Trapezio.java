package br.edu.figuGeoPlanas;

public class Trapezio {

//Atributos 
    
   private double baseMaior;
    
   private double baseMenor;
    
   private double altura;
   
   private double area;
    
//Metódos
    
   private void calcArea1() {

		area = (baseMaior + baseMenor) * altura / 2;
	    
	}
	
   public void listaAtributos() {
	   
	   System.out.println("===========TRAPÉZIO===========");
		
	   System.out.println("O valor da base maior é  " + getBaseMaior() + "cm.");

	   System.out.println("O valor da base menor é " + getBaseMenor()  + "cm.");
	   
	   System.out.println("O valor da altura é " + getAltura()  + "cm.");
		
	   System.out.println("O valor da área é " + getArea() + "cm²." );
		
    }
   
 //Metódos Especiais

   public double getBaseMaior() {
	   return this.baseMaior;
    }
   
   public void setBaseMaior(double b) {
	   this.baseMaior = b;
    }
   
   public double getBaseMenor() {
	   return this.baseMenor;
    }
   
   public void setBaseMenor(double b) {
	   this.baseMenor = b;
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
