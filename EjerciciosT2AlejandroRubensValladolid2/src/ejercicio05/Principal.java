package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pedir, entradas;
		double precio1=3, precio2=2.50, precio3=4, precio4=4.5, total;
		
		System.out.println("****************************");
		System.out.println("Sala1\t\t\t1");
		System.out.println("Sala2\t\t\t2");
		System.out.println("Sala3\t\t\t3");
		System.out.println("Sala4\t\t\t4");
		System.out.println("Salir\t\t\t5");
		System.out.println("****************************");
		System.out.println("Indique la sala que quiere información:");
		pedir=Leer.datoInt();
		
		while(pedir<=4) {
			switch (pedir) {
				case 1:
					System.out.printf("precio de entrada: %.2f$\n", precio1);
					System.out.println("Indique el número de entradas que quieres comprar:");
					entradas=Leer.datoInt();
					total=entradas*precio1;
					System.out.printf("Usted ha ordenado %d entrada/s con un valor de %.2f$\n", entradas, total);
					break;
				case 2:
					System.out.printf("precio de entrada: %.2f$\n", precio2);
					System.out.println("Indique el número de entradas que quieres comprar:");
					entradas=Leer.datoInt();
					total=entradas*precio2;
					System.out.printf("Usted ha ordenado %d entrada/s con un valor de %.2f$\n", entradas, total);
					break;
				case 3:
					System.out.printf("precio de entrada: %.2f$\n", precio3);
					System.out.println("Indique el número de entradas que quieres comprar:");
					entradas=Leer.datoInt();
					total=entradas*precio3;
					System.out.printf("Usted ha ordenado %d entrada/s con un valor de %.2f$\n", entradas, total);
					break;
				case 4:
					System.out.printf("precio de entrada: %.2f$\n", precio4);
					System.out.println("Indique el número de entradas que quieres comprar:");
					entradas=Leer.datoInt();
					total=entradas*precio4;
					System.out.printf("Usted ha ordenado %d entrada/s con un valor de %.2f$\n", entradas, total);
					break;
			}
			System.out.println("Gracias por usar el programa");
		}
	}

}
