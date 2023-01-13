package ejercicio10;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, cantidad, descuento=20, div=100, total; 
		System.out.println("Bienvenído al supermercado de tu puta madre");
		System.out.println("Indique el precio del producto:");
		
		precio=Leer.datoDouble();
		
		System.out.println("Indique la cantidad:");
		
		cantidad=Leer.datoDouble();
		
		total=precio*cantidad*descuento/div;
		
		System.out.print("El total a pagar son ");
		System.out.printf("%.2f", total);
		System.out.println("€");
		System.out.println("Gracias por utilizar el programa");
		//El operador % se llama operador módulo y nos da el resto de una división
	}

}
