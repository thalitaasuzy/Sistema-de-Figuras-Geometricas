package br.edu.figGeometricas;



public class Circulo{
    
    //Atributos
    double raio; 
    
    double diametro = 2*raio;
    
    double pi = 3.14;
    
    //Metódos
    
    public void calcArea1() {
        
        area = pi * (raio * raio)
    }
    
    public double calcArea2() {
        
         area = pi * (raio * raio)
         
         return area;
    }
    
    public void calcArea3(double r) {

		raio = r ;

		calcArea2();	

	}
	
	public void listaAtributos() {

		

		System.out.println("O valor do raio é " + raio + "cm.");
		
		System.out.println("O valor do diâmetro é " + diametro + "cm.");

		System.out.println("O valor da área é  " + area + "cm.");

	}
	
}
