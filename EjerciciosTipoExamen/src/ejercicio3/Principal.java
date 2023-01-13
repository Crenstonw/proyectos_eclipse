package ejercicio3;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fecha, patatas, bebida, hamb, cajero;
		double precioP, precioB, precioH, cantidadP, cantidadB, cantidadH, total, clienteP, devolver, totalP, totalB, totalH;
		
		System.out.println("Bienvenido al Ángel express\nQuien está tomando el pedido?");
		cajero=Leer.dato();
		
		System.out.println("Bienvenido " + cajero + ", indique la fecha de hoy");
		fecha=Leer.dato();
		
		System.out.println("Indique las patatas que va a pedir el cliente");
		patatas=Leer.dato();
		
		System.out.println("cantidad:");
		cantidadP=Leer.datoDouble();
		
		System.out.println("precio:");
		precioP=Leer.datoDouble();
		
		System.out.println("Indique la bebida que va a pedir el cliente:");
		bebida=Leer.dato();
		
		System.out.println("cantidad:");
		cantidadB=Leer.datoDouble();
		
		System.out.println("precio:");
		precioB=Leer.datoDouble();
		
		System.out.println("Indique la comida que va a pedir el cliente:");
		hamb=Leer.dato();
		
		System.out.println("cantidad:");
		cantidadH=Leer.datoDouble();
		
		System.out.println("precio:");
		precioH=Leer.datoDouble();
		
		totalP=precioP*cantidadP;
		totalB=precioB*cantidadB;
		totalH=precioH*cantidadH;
		total=totalP+totalB+totalH;
		System.out.printf("El cliente debe pagar %.2f$",total);
		System.out.println("El cliente ha pagado:");
		clienteP=Leer.datoDouble();
		devolver=clienteP-total;
		System.out.printf("Total a devolver: %.2f$", devolver);
		System.out.println("\n\n\n\n");
		System.out.println("*************************************");
		System.out.println("Ángel express");
		System.out.println(cajero);
		System.out.println(fecha);
		System.out.println("*************************************");
		System.out.printf("%.0f\t%s\t%.2f\t%.2f\n",cantidadP,patatas,precioP,totalP);
		System.out.printf("%.0f\t%s\t%.2f\t%.2f\n",cantidadB,bebida,precioB,totalB);
		System.out.printf("%.0f\t%s\t%.2f\t%.2f\n",cantidadH,hamb,precioH,totalH);
		System.out.println("*************************************");
		System.out.printf("Total a pagar:\t\t\t%.2f\n",total);
		System.out.println("Gracias por su visita");
	}

}
