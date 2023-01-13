package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// para escribir pi puedo simplemente poner Math.PI
		// para printf se puede usar: %d (decimales), %s y %c 
		double radio1= 3, radio2= 5.2, longitud=0, area=0 ;
		System.out.println("Bienvenido al programa para calcular la longitud de la circunferencia");
		longitud= 2*Math.PI*radio1;
		System.out.println("Si tienes una circunferencia de " + radio1 + "m de radio su longitud será= " + longitud + "m" );
		area= Math.PI*Math.pow(radio2,2);
		System.out.println("Si tenemos una circunferencia de " + radio2 + "m de radio su área será= " + area + "m");
		System.out.println("Gracias don Ángel por usar el programa");
	}

}
