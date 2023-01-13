package ejemploif;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// || significa O y && significa Y
		int edad, dieciocho=18;
		boolean entrada=true;
		double producto, oferta=10.00;
		
		System.out.println("indique precio producto");
		producto=Leer.datoDouble();
		
		if(producto>=oferta) {
			System.out.println("tiene descuento");
		} else {
			System.out.println("no tiene descuento");
		}
		
		System.out.println("Cual es su edad");
		edad=Leer.datoInt();
		//Se pueden poner ifs dentro del if
		if(edad>=dieciocho && entrada || edad>60) {
			System.out.println("Puedes entrar");
		}
		else {
			System.out.println("No puedes entrar");
		}
		
	}

}
