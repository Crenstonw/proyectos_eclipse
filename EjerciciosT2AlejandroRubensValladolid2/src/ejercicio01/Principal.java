package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		
		System.out.println("Bienvenido al programa para determinar si un número es mayor que otro");
		System.out.println("Indique el primer número:");
		num1=Leer.datoInt();
		
		System.out.println("Indique el segundo número:");
		num2=Leer.datoInt();
		
		if (num1>num2) {
			System.out.println("El primer número es mayor");
		}else {
			if (num1==num2) {
				System.out.println("Los números son iguales");
			} else {
			System.out.println("El segundo número es mayor");
			}
		}
		System.out.println("Gracias por usar el programa");
	}

}
