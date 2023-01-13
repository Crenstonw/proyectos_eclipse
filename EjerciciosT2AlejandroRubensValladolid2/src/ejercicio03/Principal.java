package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo=800, retirar, total;
		
		System.out.println("Bienvenido a Caja Rural");
		System.out.printf("Saldo disponible: %.2f$\n", saldo);
		System.out.println("Indique el dinero que quiere retirar:");
		retirar=Leer.datoDouble();
		
		if (saldo<retirar) {
			System.out.println("Saldo insuficiente");
		} else {
			total=saldo-retirar;
			System.out.println("Operación realizada exitosamente");
			System.out.printf("Ahora tiene en su cuenta %.2f$\n", total);
		}
		System.out.println("Gracias por su dinero");
	}

}
