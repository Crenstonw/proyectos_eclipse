package ejemploSwitch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("**************************");
		System.out.println("Principal\t\t1");
		System.out.println("Preferencias\t\t2");
		System.out.println("Salir\t\t\t3");
		System.out.println("**************************");
		num=Leer.datoInt();
		
		switch (num) {
			case 1:
				System.out.println("**************************");
				System.out.println("/56/45654&3452·24233");
				System.out.println("kjsdfsd 12334 sdkfjs 32");
				System.out.println("arriba españa");
				System.out.println("**************************");
				break;
			case 2:
				System.out.println("**************************");
				System.out.println("Preferenciame esta");
				System.out.println("Volver\t\t\t3");
				System.out.println("**************************");
				num=Leer.datoInt();
				break;
			case 3:
				System.out.println("**************************");
				System.out.println("adios");
				System.out.println("**************************");
				break;
			default:
				System.out.println("Imbécil");
				break;
		}
	}

}
