package br.edu.figuGeometricasEspaciais;

public class Piramide{
    
//Atributos
    private double apotemaPiramide;
    private double apotemaBase;
    private double arestaBase
    private double areaFace;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;
    private double alturaPiramide;
    
//Metódos

    public double calcAreaBase() {
        this.areaBase = (arestaBase*arestaBase);
    }
    
    public double calcAreaFace() {
        this.areaFace = (arestaBase * apotemaPiramide /2);
    }
    
    public double calcAreaLateral() {
        this.areaLateral = 3 * areaFace;
    }
    
    public double calcAreaTotal() {
        
        this.areaTotal = areaLateral + areaBase
    }
    
    public double calcApotemaBase() {
        this.apotemaBase = (arestaBase/2);
    }
    
    public double calcApotemaPiramide() {
        
        this.apotemaPiramide = math.sqrt((alturaPiramide*alturaPiramide) * (apotemaBase*apotemaBase)); 
    }
    
    public double calcVolume() {
        
        this.volume = (areaBase * alturaPiramide / 3); 
    }
    
    public double getArestaBase() {
        return this.arestaBase;
    }
    
    public double setArestaBase(double AB){
        this.arestaBase = AB;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double setAltura(double H){
        this.altura = H;
    }
    
    
    
    
    public double listarAtributos() {
        
        System.out.println("===========PIRAMIDE QUADRANGULAR===========");
        
        System.out.println("O valor do lado é " + getLado() + "cm.");
        
        System.out.println("O valor da área de cada face é " + areaFace + "cm².");

	System.out.println("O valor da área lateral é " + areaLateral + "cm².");
		
	System.out.println("O valor da área base é " + areaBase + "cm².");
		
	System.out.println("O valor da área total é " + areaTotal + "cm².");
		
	System.out.println("O valor do volume é: " + volume + "cm³.");
    }
    
   
}
