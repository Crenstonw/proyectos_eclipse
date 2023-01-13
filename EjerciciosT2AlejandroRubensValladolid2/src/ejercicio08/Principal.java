package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=1, num1, total=0;
		
		System.out.println("Bienvenido al sumador de números");
		System.out.println("Por favor, indique sus números:");
		
		while (numero<=10) {
			System.out.println("Indique el "+numero+" número");
			num1=Leer.datoInt();
			System.out.println(total+ " + "+ num1);
			total=num1+total;
			numero++;
		}
		
		System.out.println("La suma total es de: "+total);
		System.out.println("Gracias por usar el programa");
	}

}
