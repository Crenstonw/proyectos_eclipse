package ejemploLectura;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola, vamos a sumar dos números");
		double num1=3.0, num2=7.5, suma=0.0;
		
		System.out.println("Dime el primer número");
		
		num1=Leer.datoDouble();
		System.out.println("Dime el segundo número");
		
		num2=Leer.datoDouble();
		suma=num1+num2;
		System.out.println("La suma es: ");
	} 

}