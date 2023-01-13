package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, dos=2;
		System.out.println("Bienvenido al programa para saber si tu número es par o impar por el simple hecho de que lo son");
		System.out.println("Indique su número:");
		num=Leer.datoDouble();
		
		if (num%dos==0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		System.out.println("Gracias por usar el programa");
	}

}
