package br.edu.figuGeometricasEspaciais;

public class Piramide {
    private double base;
    private double altura;
    
    // Método getter para obter o valor da base da pirâmide
    public double getBase() {
        return base;
    }
    
    // Método setter para definir o valor da base da pirâmide
    public void setBase(double base) {
        this.base = base;
    }
    
    // Método getter para obter o valor da altura da pirâmide
    public double getAltura() {
        return altura;
    }
    
    // Método setter para definir o valor da altura da pirâmide
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para calcular e retornar a área da base da pirâmide
    public double calcularAreaBase() {
        return base * base;
    }
    
    // Método para calcular e retornar a área lateral da pirâmide
    public double calcularAreaLateral() {
        return (base * altura / 2);
    }
    
    // Método para calcular e retornar o volume da pirâmide
    public double calcularVolume() {
        return (base * base * altura) / 3;
    }
    
    // Método para imprimir as características da pirâmide
    public void listaAtributos() {
    
    	    System.out.println("===========PIRÂMIDE QUADRANGULAR===========");
    	    
    		System.out.println("O valor do base é " + getBase() + "cm.");
    		
    		System.out.println("O valor do altura é " + getAltura() + "cm.");

    		System.out.println("O valor da área da base é  " +  calcularAreaBase() + "cm².");
    		
    		System.out.println("O valor da área lateral é  " +  calcularAreaLateral() + "cm².");
    		
    		System.out.println("O valor do volume é " + calcularVolume() + "cm³");
    }
}
