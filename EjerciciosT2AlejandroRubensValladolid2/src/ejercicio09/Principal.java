package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*Leer una secuencia de números, hasta que el usuario introduzca un número negativo y mostrar
		la suma total de dichos números sin contar el negativo.*/
		double pedirNumero, total=0;
		System.out.println("Bienvenido al programa de las sumas");
		do {
			System.out.println("Introduzca un número:");
			pedirNumero=Leer.datoDouble();
			if (pedirNumero>=0) {
				total=total+pedirNumero;
			}
		} while(pedirNumero>=0);
		
		System.out.printf("El total es: %.2f", total);
	}

}
