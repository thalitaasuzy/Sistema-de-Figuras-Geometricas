package br.edu.figuGeometricasEspaciais;

import java.lang.Math.*;
public class Piramide {

	//Atributos
    private double apotemaPiramide;
    private double apotemaBase;
    private double arestaBase;
    private double areaFace;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;
    private double altura;
    private double alturaPiramide;
    
//Metódos

    public void calcAreaBase() {
        this.areaBase = (arestaBase*arestaBase);
    }
    
    public void calcAreaFace() {
        this.areaFace = (arestaBase * apotemaPiramide /2);
    }
    
    public void calcAreaLateral() {
        this.areaLateral = 3 * areaFace;
    }
    
    public void calcAreaTotal() {
        
        this.areaTotal = areaLateral + areaBase;
    }
    
    public void calcApotemaBase() {
        this.apotemaBase = (arestaBase/2);
    }
    
    public void calcApotemaPiramide() {
        
        this.apotemaPiramide = math.sqrt((alturaPiramide*alturaPiramide) * (apotemaBase*apotemaBase)); 
    }
    
    public void calcVolume() {
        
        this.volume = (areaBase * alturaPiramide / 3); 
    }
    
    public double getArestaBase() {
        return this.arestaBase;
    }
    
    public void setArestaBase(double AB){
        this.arestaBase = AB;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double H){
        this.altura = H;
    }
    
    
    
    
    public void listarAtributos() {
        
        System.out.println("===========PIRAMIDE QUADRANGULAR===========");
        
        System.out.println("O valor do lado é " + getArestaBase() + "cm.");
        
        System.out.println("O valor da área de cada face é " + areaFace + "cm².");

        System.out.println("O valor da área lateral é " + areaLateral + "cm².");
		
        System.out.println("O valor da área base é " + areaBase + "cm².");
		
        System.out.println("O valor da área total é " + areaTotal + "cm².");
		
        System.out.println("O valor do volume é: " + volume + "cm³.");
    }
    
}
