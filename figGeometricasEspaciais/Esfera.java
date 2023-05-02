package br.edu.figuGeometricasEspaciais;

public class Esfera{
    
//Atributos
    
    private double raio;
    private double PI;
    
//Metódos

    public double calcArea() {
        
        this.area = 4 * PI * ( raio*raio);
    }
    
    public double volume() {
        
        volume = 4/3 * PI * (raio* raio* raio); 
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    public double setRaio(double r){
        this.raio = r;
    }
    
    
    public double listarAtributos() {
        
        System.out.println("===========ESFERA===========");
        
        System.out.println("O valor do raio é " + getRaio() + "cm.");
        
		System.out.println("O valor do π é " + PI );
		
		System.out.println("O valor da área total é " + area + "cm².");
		
		System.out.println("O valor do volume é: " + volume + "cm³.");
    }
    
   
}
