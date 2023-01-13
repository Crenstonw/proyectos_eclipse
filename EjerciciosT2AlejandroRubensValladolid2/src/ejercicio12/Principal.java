package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horasTrabajo, total=0, dineroHora=16, total2, horasEQ=40;
		char respuesta='y';
		
		System.out.println("Bienvenido al programa de gestión de sueldo");

		do {
			horasTrabajo=0;
			total=0;
			System.out.println("¿Cuantas horas ha trabajado el empleado?");
			horasTrabajo=Leer.datoInt();
			if (horasTrabajo<=horasEQ) {
				total=horasTrabajo*dineroHora;
			} else {
				do {
					total=total+dineroHora;
					horasTrabajo--;
				} while (horasTrabajo!=horasEQ);
				total2=dineroHora*horasTrabajo;
				total=total+total2;
			}
			System.out.printf("Este empleado debe cobrar: %d€\n", total);
			System.out.println("¿Desea calcular otro salario? y/n");
			respuesta=Leer.datoChar();
		} while (respuesta=='y');
		
		System.out.println("Gracias por usar el programa");
	}

}
