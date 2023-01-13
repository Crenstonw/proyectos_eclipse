package ejercicio1;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math.pow Math.PI %
		double celsius, fahrenheit, conv1=32, conv2=5, conv3=9;
		System.out.println("Bienvenido al programa para pasar de Grados fahrenheit a Celsius");
		System.out.println("Por favor, indique la temperatura:");
		fahrenheit=Leer.datoDouble();
		
		celsius=(fahrenheit-conv1)*(conv2/conv3);
		System.out.printf("La temperatura es de %.2f grados celsius\n", celsius);
		System.out.println("Gracias por usar el programa.");
	}

}
