/*
 * 
 * 
 * 
 */

package arraysMultidimensional;

public class ArraysMultidimensionales {

	public static void main(String[] args) {

		int[][] temperatura = new int[12][30];
		int tempAlta, diaCaluroso, diaFrio, tempBaja,tempMenor, diaInferior;

		for (int mes = 0; mes < 12; mes++) {

			System.out.print("Mes " + (mes + 1) + ": ");
			diaCaluroso = 0;
			diaFrio = 0;
				
			// bucle inicializaciones 
			
			for (int dias1 = 0; dias1 < 30; dias1++) {

				temperatura[mes][dias1] = (int) (Math.random() * 40);
				System.out.print(temperatura[mes][dias1] + " ");

			}

			tempAlta = temperatura[mes][0];
			tempBaja = temperatura[mes][0];
			tempMenor = temperatura[mes][0];
			diaInferior = 0;	
			int dias3 = 0;
			
			// bucle para dias calurosos y frios
			
			for (int dias2 = 0; dias2 < 30; dias2++) {

				if (tempAlta < temperatura[mes][dias2]) {
					tempAlta = temperatura[mes][dias2];

					diaCaluroso = dias2;

				}
				if (tempBaja > temperatura[mes][dias2]) {
					tempBaja = temperatura[mes][dias2];

					diaFrio = dias2;

				}

			
			// bucle para numero menor de 10
				
				while (10 <= tempMenor) {

					tempMenor = temperatura[mes][dias3];
					dias3++;

				}
				diaInferior = dias3;
			}
			System.out.println();
			System.out.println("\nEl dia caluroso de este mes es el dia: " + (diaCaluroso + 1) + ", la temperatura fué de: " + tempAlta);
			System.out.println("El dia frio de este mes es el dia: " + (diaFrio + 1) + ", la temperatura fué de: " + tempBaja);
			System.out.println("La amplitud termica es de: " + (tempAlta - tempBaja)  );
			System.out.println("El primer dia con temperatura inferior a 10 es el: dia " + diaInferior +" con una temperatura de: "+ tempMenor + "\n\n");

		}

	}
}
