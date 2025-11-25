package ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int SalarioJefe = 10000, SalarioEncargado=5000,  SalarioOficinistas = 4000, numeroOficinistas= 10, presupuestoEmpresa = 100000;
		boolean proyectosTerminados = false;
		
		auditoriaEmpresa(SalarioJefe, SalarioEncargado, SalarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
		

	}
	
	public static boolean auditoriaEmpresa(int SalarioJefe, int SalarioEncargado, int  SalarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, int presupuestoEmpresa) {
		
		boolean auditoria;
		
		
		if(proyectosTerminados) {
			int sueldosGlobales =(SalarioJefe + SalarioEncargado +  SalarioOficinistas);
			
			if(sueldosGlobales >20000) {
				
				auditoria = false;
				System.out.println(" No ha pasado la auditoría ya que el gasto en personal es de ... y\r\n"
						+ "excede el límite mensual de 20.000 euros");
				
				
			}else if(presupuestoEmpresa > 100000){
				
				 
					
					auditoria = false;
					System.out.println("No ha pasado la auditoría ya que el presupuesto\r\n"
							+ "asignado de .... excede el límite establecido de 100.000 euros");
			}else {
					auditoria=true;
					System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
				}
				
		
		}else {
			
			auditoria=false;
			System.out.println("No ha pasado la auditoría ya que no ha terminado los\r\n"
					+ "proyectos acordados");
		}
		
		
		
		
		
		
		return auditoria;
		
	}
	

}
