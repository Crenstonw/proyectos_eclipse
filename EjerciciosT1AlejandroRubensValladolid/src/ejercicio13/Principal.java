package ejercicio13;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prod1="Cocacola", prod2="Pipas", prod3="Espada garra";
		double prec1=0.70, prec2=0.40, prec3=150, und1, und2, und3, total1, total2, total3, totalt;
		
		System.out.println("Bienvenido a Supermercados John Snow");
		System.out.println("Cuantas cocacolas quieres comprar:");
		und1=Leer.datoDouble();
		
		System.out.println("Cuantas pipas quieres comprar:");
		und2=Leer.datoDouble();
		
		System.out.println("Cuantas espadas garra quieres comprar:");
		und3=Leer.datoDouble();
		
		total1=prec1*und1;
		total2=prec2*und2;
		total3=prec3*und3;
		
		System.out.println("Supermercados \t John Snow");
		System.out.println("**************************************");
		System.out.println("Atendido por: \t John Snow");
		System.out.println("**************************************");
		System.out.printf("x%.0f\t%s\t\t%.2f$\n", und1, prod1, total1);
		
		System.out.printf("x%.0f\t%s\t\t\t%.2f$\n", und2, prod2, total2);
		
		System.out.printf("x%.0f\t%s\t\t%.2f$\n", und3, prod3, total3);

		totalt=total1+total2+total3;
		System.out.println("**************************************");
		System.out.println("TOTAL:\t\t\t\t" + totalt +"$");
	}

}
