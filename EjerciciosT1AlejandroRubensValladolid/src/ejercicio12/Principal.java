package ejercicio12;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, v, i, k=1000;
		
		System.out.println("Bienvenido al programa para calcular la intensidad");
		System.out.println("Cuál es su resistencia eléctrica");
		
		r=Leer.datoDouble();
		
		System.out.println("¿Cuánta tensión tiene?");
		
		v=Leer.datoDouble();
		
		i=v/(r*k);
		
		System.out.println("Tiene una intensidad de ");
		System.out.printf("%.2f", i);
		System.out.println(" amperios");
		System.out.println("Gracias por usar el programa");
		
	}

}
