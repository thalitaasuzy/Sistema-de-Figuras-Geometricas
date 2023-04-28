package br.edu.figGeometricas;

public class Losango{
    
    //Atributos 
    
    double dMaior;
    
    double dMenor;
    
    //Metódos
    
    public void calcArea1() {

		 area = (dMaior * dMenor) / 2
      
   }
		
	  public void calcArea2() {

		 area = (dMaior * dMenor) / 2
		
		 return area
   
  }
  
	  public void calcArea3(double D, double d) {
	    
	    dMaior = D;
	    
	    dMenor = d;

		  calcArea2();	
	    
	}
	
	  public void listarAtributos() {
		
		 System.out.println("O valor da diagonal maior é  " + dMaior + "cm.");

		 System.out.println("O valor da diagonal menor é " + dMenor  + "cm.");
		
		 System.out.println("O valor da área é " + area + "cm." )
  }
		

}
