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
	  
	
	
	 
	  public NuevoAlumno (double x1, double y1, double x2, double y2, String nombre, String color) throws IllegalArgumentException {
		  // Comprobación de que los valores de entrada son válidos

		  if (x1>=x2 || y1>y2)  // Comprobación de que la ubicación no es inconsistente (x1,y1) debe estar a la izquierda y por debajo de (x2,y2)
		      throw new IllegalArgumentException (
			    String.format ("El vértice (x1,y1)=(%.2f,%.2f) debe estar a la izquierda y por debajo del (x2,y2)=(%.2f,%.2f)", 
			    x1, y1, x2, y2)
		      );
		  if ( nombre == null || nombre.isEmpty() )  // Comprobación de que el nombre no es null ni vacío
		      throw new IllegalArgumentException ("nombre null o vacío");
		  if ( color== null || color.isEmpty() )  // Comprobación de que el color no es null ni vacío
		      throw new IllegalArgumentException ("color null o vacío");

		  // Una vez que se ha garantizado que todos los valores de entrada son apropiados, puede continuar el proceso de instanciación
		  // del objeto
		    
		  // Asignación de valores iniciales a los atributos de estado
		  this.x1= x1;
		  this.y1= y1;
		  this.x2= x2;
		  this.y2= y2;
		  this.nombre= nombre;
		  this.color= color;  
		  
		  // Actualización de atributos de clase por el hecho de crearse un nuevo rectángulo
		  Rectangulo.cantidadRectangulos++;  // Incrementamos la cantidad de rectángulos creados  
		}
	  
	  
	  
	  
	
	

}
