package edu.conversionClase;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// metodo por donde entrará la aplicacion
		
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
	
	
	public  static void deIntAString (int numeroEntero) {
		
		int numeroEntero= 5;
		String texto = Double.toString(numeroReal);
		
		System.out.println("valor string" + texto);
	
		
		Scanner numeroIntroducido = new Scanner(System.in);
		numero = numeroIntroducido.nextDouble(); 
		System.out.println ("El número untroducido es " + numero);	
		
		
	}

	
}
