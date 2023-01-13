package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa dirigido por menús que solicite el peso de una persona, y escriba por
pantalla su peso en cualquier planeta del Sistema Solar. Las equivalencias son las siguientes
(basta con multiplicar el peso de la persona en la tierra por la constante de equivalencia):
	PLANETA 		Mercurio 	Venus 	Tierra 	Marte 	Júpiter 	Saturno 	Urano 	Neptuno
	EQUIVALENCIA 	0.38 		0.91 	1.00 	0.38 	2.53 		1.06 		0.92 	1.2*/
		double peso=0, total, mercurio=0.38, venus=0.91, tierra=1,marte=0.38,jupiter=2.53,saturno=1.06,urano=0.92,neptuno=1.2;
		int seleccion, planeta=3;
		String menuPlaneta="Tierra";
		
		System.out.println("Bienvenido al programa para saber cuanto pesas en otro planeta");
		do {
			do {
				seleccion=0;
				System.out.println("Indique que quiere hacer:");
				System.out.println("Establecer peso\t\t1");
				System.out.println("Seleccionar planeta\t2");
				System.out.println("Realizar los calculos\t3");
				System.out.println("Salir\t\t\t4");
				System.out.println("****************************");
				System.out.printf("Peso seleccionado: %.2f\n", peso);
				System.out.println("Planeta seleccionado: " + menuPlaneta);
				System.out.println("****************************");
				seleccion=Leer.datoInt();
				
				switch (seleccion) {
					case 1:
						System.out.println("Indique su peso:");
						peso=Leer.datoDouble();
						break;
					case 2:
						System.out.println("Indique el planeta que quiere comparar:");
						System.out.println("Mercurio\t1");
						System.out.println("Venus\t\t2");
						System.out.println("Tierra\t\t3");
						System.out.println("Marte\t\t4");
						System.out.println("Júpiter\t\t5");
						System.out.println("Saturno\t\t6");
						System.out.println("Urano\t\t7");
						System.out.println("Neptuno\t\t8");
						System.out.println("***********************");
						planeta=Leer.datoInt();
						switch (planeta) {
							case 1:
								menuPlaneta="Mercurio";
								break;
							case 2:
								menuPlaneta="Venus";
								break;
							case 3:
								menuPlaneta="Tierra";
								break;
							case 4:
								menuPlaneta="Marte";
								break;
							case 5:
								menuPlaneta="Júpiter";
								break;
							case 6:
								menuPlaneta="Saturno";
								break;
							case 7:
								menuPlaneta="Urano";
								break;
							case 8:
								menuPlaneta="Neptuno";
								break;
						}
						break;
					case 3:
						switch (planeta) {
							case 1:
								total=peso*mercurio;
								System.out.printf("Su peso es de %.2f en Mercurio\n\n",total);
								break;
							case 2:
								total=peso*venus;
								System.out.printf("Su peso es de %.2f en Venus\n\n",total);
								break;
							case 3:
								total=peso*tierra;
								System.out.printf("Su peso es de %.2f en Tierra\n\n",total);
								break;
							case 4:
								total=peso*marte;
								System.out.printf("Su peso es de %.2f en Marte\n\n",total);
								break;
							case 5:
								total=peso*jupiter;
								System.out.printf("Su peso es de %.2f en Júpiter\n\n",total);
								break;
							case 6:
								total=peso*saturno;
								System.out.printf("Su peso es de %.2f en Saturno\n\\n",total);
								break;
							case 7:
								total=peso*urano;
								System.out.printf("Su peso es de %.2f en Urano\n\n",total);
								break;
							case 8:
								total=peso*neptuno;
								System.out.printf("Su peso es de %.2f en Neptuno\n\n",total);
								break;
							
						}
				} 
			
			} while (seleccion<=3);
			
		} while (seleccion!=4);
		System.out.println("Gracias por usar el programa");
	}

}