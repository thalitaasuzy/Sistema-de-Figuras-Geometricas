package br.edu.principal;

import br.edu.figuGeoPlanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo T1 = new Triangulo();
		T1.setBase(4);
		T1.setAltura(6);
		T1.listaAtributos();
		
		System.out.println();
		
		Quadrado Q1 = new Quadrado();
		Q1.setLado(3);
		Q1.listaAtributos();
		
		System.out.println();
		
		Retangulo R1 = new Retangulo();
		R1.setLadoA(4);
		R1.setLadoB(5);
		R1.listaAtributos();
		
		System.out.println();
		
		Losango L1 = new Losango();
		L1.setDMaior(5);
		L1.setDMenor(3);
		L1.listaAtributos();
		
		System.out.println();
		
		Trapezio Tr1 = new Trapezio();
		Tr1.setBaseMaior(4);
		Tr1.setBaseMenor(3);
		Tr1.setAltura(3);
		Tr1.listaAtributos();
		
		System.out.println();
		
		Paralelogramo P1 = new Paralelogramo();
		P1.setLadoA(4);
		P1.setLadoB(6);
		P1.listaAtributos();
		
		System.out.println();
		Circulo C1 = new Circulo();
		C1.setRaio(3);
		C1.listaAtributos();
		
		
		
		
		

	}

}
