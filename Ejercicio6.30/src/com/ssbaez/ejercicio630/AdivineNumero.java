package com.ssbaez.ejercicio630;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdivineNumero {
	
	public static void main(String[] args) {
		
		SecureRandom numAleatorio = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int seleccion;
		
		while(true) {
			
			int aleatorio = 1 + numAleatorio.nextInt(1000);
			
			System.out.println("Adivine un numero entre el 1 y 1000");
			
			while(true) {
				System.out.print("Ingrese un numero: ");
				int num1 = input.nextInt();
				
				if(num1 > aleatorio)
					System.out.println("\nDemasiado ALTO. Intente de nuevo");
				
				if(num1 < aleatorio)
					System.out.println("\nDemasiado BAJO. Intente de nuevo");
				
				if(num1 == aleatorio) {
					System.out.println("Felicidades. Adivino el numero");
					System.out.println("\nQuiere jugar de nuevo? 1) Si 2) No");
					System.out.print("----> ");
					seleccion = input.nextInt();
					break;
				}
			}
			
			if(seleccion == 1)
				System.out.println("VOLVER A JUGAR");
			
			if(seleccion == 2) {
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			
		}
		
	}//Fin metodo main

}//Fin declaracion de clase
