package ejercicio2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// se pueden declarar las variables en la misma línea si son del mismo tipo ejem. double dato1=1, dato2=2;
		double largo = 50;
		double ancho = 21;
		double prof = 2.5;
		double coste = 1.8;
		double conv = 1000;
		
		System.out.println("Bienvenido, vamos a calcular lo que costaría llenar una piscina");
		System.out.println("La piscina tiene " + largo + "m de largo");
		System.out.println("La piscina tiene " + ancho + "m de ancho");
		System.out.println("La piscina tiene " + prof + "m de profundidad");
		double mCubico = largo*ancho*prof;
		System.out.println("Los metros cúbicos de la piscina son " + mCubico + "m^3");
		double litros = mCubico * conv;
		System.out.println("Los litros de la piscina son: " + litros + "l");
		double total = mCubico*coste;
		System.out.println("Si cada metro cúbico de agua vale 1.8$, el coste total es de " + total + "$");
		System.out.println("Un saludo");
		
		System.out.println("Voy a imprimir con formato");
		double d = 123.23734;
		BigDecimal bd = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP);
		
		//En printf no se usa el +, es necesario usar el \n
		System.out.printf("%.2f", d);
	}

}
