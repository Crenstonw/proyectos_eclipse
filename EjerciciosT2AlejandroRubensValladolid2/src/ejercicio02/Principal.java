package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, total;
		
		System.out.println("bienvenido al programa para dividir");
		System.out.println("Indique el dividendo:");
		num1=Leer.datoDouble();
		
		System.out.println("Indique el divisor:");
		num2=Leer.datoDouble();
		
		if (num2==0) {
			System.out.println("Error, el divisor no puede ser 0");
		} else {
			total=num1/num2;
			System.out.printf("El total es %.2f", total);
		}
		
		System.out.println("Gracias por usar el programa");
	}

}
