package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exponente=1, numero, total, tabla=10, respuesta=1;
		System.out.println("bienvenido al programa de las tablas de multiplicar");
		
		do {
			System.out.println("Indique el número con el que quieres saber su tabla:");
			numero=Leer.datoInt();
		
			System.out.println("Tabla del " + numero + ":");
			System.out.println("*****************************");
			while (exponente<=tabla) {
				total=exponente*numero;
				System.out.printf("\t%dx%d=\t%d\n", numero, exponente, total);
				exponente++;
			}
			System.out.println("*****************************");
			System.out.println("Si quiere calcular otra tabla pulse 1");
			respuesta=Leer.datoInt();
			exponente=1;
		} while (respuesta==1);
		System.out.println("Gracias por usar el programa");
	}

}
