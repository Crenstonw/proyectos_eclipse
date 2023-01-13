package ejercicioPedro;

import utilidades.Leer;

public class Principal {

public static void main(String[] args) {
// TODO Auto-generated method stub

/* Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido
que abrir pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo
y la capacidad del depósito para guardar el agua en metros cúbicos. Serías capaz de crear
un programa que calcule cuántos metros cúbicos se sacan de uno de los pozos que tiene
un caudal de 8 litros por segundo si está conectado 24 horas. */

double horas=0.0;
double segundos=0.0;
double segundos2=60;
double minutos=60;
double caudal= 0.0;
double mcubico=0.001;
double volumen=0.0;

System.out.println("Bienvenido al programa para calcular cuantos metros cúbicos se sacan del pozo");

System.out.println("Introduzca el caudal en segundos");
caudal=Leer.datoDouble();

System.out.println("Introduzca las horas de conexión");
horas=Leer.datoDouble();

segundos=horas*minutos*segundos2;

volumen=caudal*segundos*mcubico;
System.out.println("Los metros cúbicos vaciados son " +volumen +" l");

System.out.println("Gracias por usar Vaciatronico Don Ángel");
}

}