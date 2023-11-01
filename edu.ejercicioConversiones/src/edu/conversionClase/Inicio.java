package edu.conversionClase;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// metodo por donde entrará la aplicación
		
		// double -> int
		int numeroEntero;
		numeroEntero= deDoubleAInt();	
		
		// Double -> string
		deIntAString (numeroEntero);
	}
		
	public static int deDoubleAInt () {
		
		double numero;
		System.out.println("Introduce un número");
		Scanner numeroIntroducido = new Scanner(System.in);
		numero = numeroIntroducido.nextDouble();
		int numeroEntero = (int) numero;
		
		return numeroEntero;
		
	}
	
	
	public static void deIntAString (int numeroEntero) {
		String texto = String.valueOf(numeroEntero);
		System.out.println("valor string: " + texto);
	}
}
