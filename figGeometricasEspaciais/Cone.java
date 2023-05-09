package br.edu.figuGeometricasEspaciais;

public class Cone {
	    private double raio;
	    private double altura;
	    
	    // Método getter para obter o valor do raio do cone
	    public double getRaio() {
	        return raio;
	    }
	    
	    // Método setter para definir o valor do raio do cone
	    public void setRaio(double raio) {
	        this.raio = raio;
	    }
	    
	    // Método getter para obter o valor da altura do cone
	    public double getAltura() {
	        return altura;
	    }
	    
	    // Método setter para definir o valor da altura do cone
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	    
	    // Método para calcular e retornar a área da base do cone
	    public double calcularAreaBase() {
	        return Math.PI * raio * raio;
	    }
	    
	    // Método para calcular e retornar a área lateral do cone
	    public double calcularAreaLateral() {
	        return Math.PI * raio * calcularGeratriz();
	    }
	    
	    // Método para calcular e retornar a área total do cone
	    public double calcularAreaTotal() {
	        return calcularAreaBase() + calcularAreaLateral();
	    }
	    
	    // Método para calcular e retornar o volume do cone
	    public double calcularVolume() {
	        return (Math.PI * raio * raio * altura) / 3;
	    }
	    
	    // Método para calcular e retornar a geratriz do cone
	    public double calcularGeratriz() {
	        return Math.sqrt(raio * raio + altura * altura);
	    }
	    
	    // Método para imprimir as características do cone
	    public void listaAtributos() {
	    	System.out.println("===========CONE===========");
	        System.out.println("Raio: " + raio);
	        System.out.println("Altura: " + altura);
	        System.out.println("Área da base: " + calcularAreaBase());
	        System.out.println("Área lateral: " + calcularAreaLateral());
	        System.out.println("Área total: " + calcularAreaTotal());
	        System.out.println("Volume: " + calcularVolume());
	    }

}
