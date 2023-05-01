package br.edu.figuGeoPlanas;

public class Losango {

//Atributos 
    
   private double dMaior;
    
   private double dMenor;
    
   private double area;
    
//Métodos
    
   private void calcArea1() {
	   
	   area = (dMaior * dMenor) / 2;
	   
   }
	
   public void listaAtributos() {
	   
	   System.out.println("===========LOSÂNGO===========");
	   
	   System.out.println("O valor da diagonal maior é  " + getDMaior() + "cm.");

	   System.out.println("O valor da diagonal menor é " + getDMenor()  + "cm.");
		
	   System.out.println("O valor da área é " + getArea() + "cm²." );
	   
  }
   
 //Métodos Especiais
   
   public double getDMaior() {
	   return this.dMaior;
   }
   
   public void setDMaior(double d) {
	   this.dMaior = d;
   }
   
   public double getDMenor() {
	   return this.dMenor;
   }
   
   public void setDMenor(double d) {
	   this.dMenor = d;
   }
   
   public double getArea() {
	   calcArea1();
	   return this.area;
   }
		
}
