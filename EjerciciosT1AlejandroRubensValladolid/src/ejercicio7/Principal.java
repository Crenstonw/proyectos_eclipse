package ejercicio7;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio= 1.64, kilometrosR=1000, consume1=5.3, kmEnConsumir=100;
		
		System.out.println("Bienvenido al programa para calcular cuanto gastas");
		System.out.println("Si viajas " + kilometrosR + "km, tu coche consume " + consume1 + " l cada 100km y el precio del combustible esta a" 
		+ precio + "$");
		double consumeF= consume1/kmEnConsumir;
		double gastado = kilometrosR*consumeF*precio;
		System.out.println("Usted ha gastado: " + gastado + "$ en este viaje.");
		System.out.println("Gracias por su tiempo");
	}

}
