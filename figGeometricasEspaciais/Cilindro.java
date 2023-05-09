package br.edu.figuGeometricasEspaciais;

public class Cilindro {
	    private double raio;
	    private double altura;
	    
	    // Método getter para obter o valor do raio do cilindro
	    public double getRaio() {
	        return raio;
	    }
	    
	    // Método setter para definir o valor do raio do cilindro
	    public void setRaio(double raio) {
	        this.raio = raio;
	    }
	    
	    // Método getter para obter o valor da altura do cilindro
	    public double getAltura() {
	        return altura;
	    }
	    
	    // Método setter para definir o valor da altura do cilindro
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	    
	    // Método para calcular e retornar a área da base do cilindro
	    public double calcularAreaBase() {
	        return Math.PI * raio * raio;
	    }
	    
	    // Método para calcular e retornar a área lateral do cilindro
	    public double calcularAreaLateral() {
	        return 2 * Math.PI * raio * altura;
	    }
	    
	    // Método para calcular e retornar a área total do cilindro
	    public double calcularAreaTotal() {
	        return 2 * calcularAreaBase() + calcularAreaLateral();
	    }
	    
	    // Método para calcular e retornar o volume do cilindro
	    public double calcularVolume() {
	        return Math.PI * raio * raio * altura;
	    }
	    
	    // Método para imprimir as características do cilindro
	    public void listaAtributos() {
	    	System.out.println("===========CILINDRO===========");
	        System.out.println("Raio: " + raio);
	        System.out.println("Altura: " + altura);
	        System.out.println("Área da base: " + calcularAreaBase());
	        System.out.println("Área lateral: " + calcularAreaLateral());
	        System.out.println("Área total: " + calcularAreaTotal());
	        System.out.println("Volume: " + calcularVolume());
	    }

}
