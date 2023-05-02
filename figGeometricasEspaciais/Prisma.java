package br.edu.figuGeometricasEspaciais;

public class Prisma{
    
//Atributos
    
    private double lado;
    private double areaFace;
    private double areaLateral;
    private double areaBase;
    private double areaTotal;
    private double volume;
    
//Metódos

    public double calcAreaLateral() {
        
        this.areaLateral = 3 * (lado * lado);
    }
    
    public double calcAreaBase() {
        this.areaBase = 2 * ((lado*lado) * math.sqrt(3) / 4)
    }
    
    public double calcAreaTotal() {
        
        this.areaTotal = areaLateral + areaBase
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
        
        System.out.println("===========PRISMA TRIGONAL RETO===========");
        
        System.out.println("O valor do lado é " + getLado() + "cm.");
        
        System.out.println("O valor da área de cada face é " + areaFace + "cm².");

		System.out.println("O valor da área lateral é " + areaLateral + "cm².");
		
		System.out.println("O valor da área total é " + areaBase + "cm².");
		
		System.out.println("O valor da área total é " + areaTotal + "cm².");
		
		System.out.println("O valor do volume é: " + volume + "cm³.");
    }
    
   
}
