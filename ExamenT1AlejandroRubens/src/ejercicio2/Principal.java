package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nH="Noches hotel", c="Cenas", g="Gasolina";
		double hHotel=80, cena=132.50, gasolina=40;
		double nocheH=6, nCenas=2, tGasolina=6;
		double totalH, totalC, totalG, totalT;
		double conv1=5, conv2=100, precioD;
		double dineroBanco=800, dineroActual;
		double personas=5, pagarPersona;
		
		precioD=hHotel*conv1/conv2;
		totalH=nocheH*(hHotel-precioD);
		totalC=nCenas*cena;
		totalG=tGasolina*gasolina;
		totalT=totalH+totalG+totalC;
		
		System.out.println("Bienvenido al programa de No Morosos");
		System.out.println("****************************************");
		System.out.println("Ticket de gastos");
		System.out.println("****************************************");
		System.out.printf("x%.0f\t%s\t%.2f€\t%.2f€\n",nocheH,nH,hHotel,totalH);
		System.out.printf("x%.0f\t%s\t\t%.2f€\t%.2f€\n",nCenas,c,cena,totalC);
		System.out.printf("x%.0f\t%s\t%.2f€\t%.2f€\n",tGasolina,g,gasolina,totalG);
		System.out.println("****************************************");
		System.out.printf("Total\t\t\t\t%.2f€\n\n",totalT);
		dineroActual= dineroBanco-totalT;
		pagarPersona=totalT/personas;
		
		System.out.printf("Su dinero actualmente es de %.2f€\n",dineroActual);
		System.out.printf("El total a pagar por cabeza son %.2f€\n\n",pagarPersona);
		System.out.println("Gracias por usar el programa");
	}

}
