package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double producto=0, descuento=0, resultado=0, cien=100;
		
		System.out.println("introduzca el nombre");
		
		nombre=Leer.dato();
		System.out.println("Bienvenido al programa de calcular los descuentos " + nombre + "!");
		
		System.out.println("Ponga el precio del producto:");
		producto=Leer.datoDouble();
		
		System.out.println("Ponga el descuento del producto:");
		descuento=Leer.datoDouble();
		resultado=producto-(producto*descuento/cien);
		System.out.println("El precio con descuento es de: " + resultado + "$");
		System.out.println("Gracias por usar el programa");
	}

}
