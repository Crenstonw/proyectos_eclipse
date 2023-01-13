package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double personas=0, navas=1500;
		double total=0;
		
		System.out.println("Bienvenido al calculador de Navas");
		System.out.println("Cuantas personas caben en el local:");
		
		personas=Leer.datoInt();
		total=personas/navas;
		
		System.out.print("Caben ");
		System.out.printf("%.2f", total);
		System.out.println(" navas");
		System.out.println("Gracias por usar el programa");
	}

}
