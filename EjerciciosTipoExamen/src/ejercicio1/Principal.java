package ejercicio1;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pCoche, pFinal, porcentajeGanancia, porcentajeImpuestos;
		double conv1=100, conv2=12.5, conv3=15;
		System.out.println("Bienvenido cochesl, indique el precio del coche:");
		pCoche=Leer.datoDouble();
		
		porcentajeGanancia=pCoche*conv3/conv1;
		porcentajeImpuestos=pCoche*conv2/conv1;
		pFinal=pCoche+porcentajeGanancia+porcentajeImpuestos;
		
		System.out.printf("El porcentajde de ganancia es %.2f$\n",porcentajeGanancia);
		System.out.printf("El porcentajde de impuestos es %.2f$\n",porcentajeImpuestos);
		System.out.printf("El precio del coche venta al público es: %.2f$\n",pFinal);
	}

}
