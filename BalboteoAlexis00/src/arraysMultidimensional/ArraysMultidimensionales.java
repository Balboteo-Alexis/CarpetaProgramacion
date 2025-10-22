/*
 * 
 * 
 * 
 */

package arraysMultidimensional;

public class ArraysMultidimensionales {

	public static void main(String[] args) {

		int[][] temperatura = new int[12][30];
		int tempAlta, diaCaluroso, diaFrio, tempBaja;

		for (int mes = 0; mes < 12; mes++) {

			System.out.print("Mes " + (mes + 1) + ": ");
			diaCaluroso = 0;
			diaFrio = 0;

			for (int i2 = 0; i2 < 30; i2++) {

				temperatura[mes][i2] = (int) (Math.random() * 40);
				System.out.print(temperatura[mes][i2] + " ");

			}
			
			tempAlta = temperatura[mes][0];
			tempBaja = temperatura[mes][0];

			for (int i3 = 0; i3 < 30; i3++) {

				if (tempAlta < temperatura[mes][i3]) {
					tempAlta = temperatura[mes][i3];

					diaCaluroso = i3;

				}
				if (tempBaja > temperatura[mes][i3]) {
					tempBaja = temperatura[mes][i3];

					diaFrio = i3;

				}
			}

			System.out.println();
			System.out.println("El dia caluroso de este mes es el dia: " + (diaCaluroso + 1)
					+ ", la temperatura fué de: " + tempAlta);
			System.out.println(
					"El dia frio de este mes es el dia: " + (diaFrio + 1) + ", la temperatura fué de: " + diaFrio);
			System.out.println("La amplitud termica es de: " + (tempAlta - diaFrio) + "\n");
		}

	}

}
