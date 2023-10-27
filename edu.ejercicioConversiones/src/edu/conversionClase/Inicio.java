package edu.conversionClase;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// metodo por donde entrará la aplicacion
		
		// double -> int
		public int EscribeunNumero(Scanner comunicacionTecladoM)
		int opcionSeleccionada;
		
		
		deDoubleAInt ();
		
		// Double -> string
		deDoubleAString ();

	}
	
	public static void deDoubleAInt () {
		
		double numeroReal = 5;
		int numeroEntero = (int)4.6;
		
	 
	    
	    System.out.println ("valor numero entero" + numeroEntero);
		System.out.println ("valor numero double" + numeroReal);
		
	}
	
	
	public  static void deDoubleAString () {
		
		double numeroReal= 5;
		String texto = Double.toString(numeroReal);
		
		System.out.println("valor string" + texto);
	
		
		
		
		
	}

}
