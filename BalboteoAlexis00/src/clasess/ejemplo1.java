package clasess;

import java.time.LocalDate;
import java.time.LocalTime;

public class ejemplo1 {

	// ATRIBUTOS DE CLASE: sólo habrá un atributo (común para todos los objetos) parar representar estas características
	  // -----------------------------------------------------------------------------------------------------------------

	  // Atributos de clase constantes (representan características "inmutables" de la clase como por ejemplo restricciones o valores informativos)
	  public final static short MAXIMOS_NUM_ALUMNOS_CENTRO =  10000;  
	  public final static short MAXIMOS_NUM_ALUMNOS_CLASE =  10000;  
	  public final static short MINIMO_NUM_ALUMNOS_CLASE =  10000;  
	  public final static LocalTime HORA_MAXIMA_CENTRO = LocalTime.of(8, 20, 45)  ;  

	  // Atributos de clase variables (representan información de la clase que es común e independiente de cualquier objeto Vehiculo en particular)
	  private static short  numAlumnos;           // Cantidad de alumnos por clase


	  // ATRIBUTOS DE OBJETO: cada vehículo tendrá su propio valor para representar estas características
	  // ------------------------------------------------------------------------------------------------

	  // Atributos de objeto constantes (representan características "inmutables" del vehículo)
	  private final String dni = "";     			// DNI del alumno
	 
	 


	  // Atributos de objeto variables (representan el estado del vehículo en un instante dado)
	  private  String nombre;     		     	// nombre del alumno
	  private String apellidos;       	  // apellidos del alumno
	  private  LocalDate fecha_nacimiento;     // fecha_nacimiento del alumno
	  private byte    hermanos;             // 
	  private LocalTime  horaSalida  = LocalTime.of(8, 20, 45);           // 
	  private double peso;           // peso del alumno
	  private double altura;        // altura del alumno
	  private boolean mayorEdad;
	  public enum NivelIngles{A1,A2,B1,B2,C1,C2} ;
	  
	
	
	 
	
	

}
