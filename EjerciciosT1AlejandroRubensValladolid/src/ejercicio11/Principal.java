package ejercicio11;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ls, horas, conv1=1000, conv2=60, total;
		
		System.out.println("Bienvenido al programa para calcular cuanta agua saca el pozo");
	System.out.println("¿Cuántos litros por segundo tiene el cauda?");
		
		ls=Leer.datoDouble();
		
		System.out.println("¿Cuántas horas va a estar conectado?");
		
		horas=Leer.datoDouble();
		
		total=ls*conv2*conv2*horas/conv1;
		
		System.out.print("Usted llenará ");
		System.out.printf("%.2f", total);
		System.out.println(" metros cúbicos de agua en ese tiempo");
		System.out.println("Gracias por usar el programa");
		
	}

}

Decimal
laVariableQueVaríaSegúnVariamos