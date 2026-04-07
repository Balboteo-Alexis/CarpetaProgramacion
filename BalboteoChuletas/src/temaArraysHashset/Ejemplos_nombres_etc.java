package temaArraysHashset;

public class Ejemplos_nombres_etc {
	
	
	
	String[] nombres = {
		    "USER", "pepe", "jose", "manolo", "fede", "arnau", "blizcrank", "rana", "loco", "camilo",
		    "ana", "lucia", "marta", "laura", "carlos", "david", "pablo", "sergio", "javier", "alberto",
		    "nuria", "sara", "paula", "elena", "irene", "raquel", "noelia", "cristina", "sonia", "patricia",
		    "miguel", "daniel", "adrian", "ivan", "marcos", "hugo", "alex", "victor", "gonzalo", "roberto",
		    "andres", "ruben", "cesar", "diego", "hector", "nacho", "ismael","bruno", "mateo", "julian"};
		
	String[] sexos = { "Hombre", "Mujer" };
	String[] estados = { "Soltero", "Casado", "Divorciado", "Viudo" };

	

	try {
		tercero.addAll(primero);
		
	} catch (UnsupportedOperationException ex1) {
		
		System.out.println(ex1.getMessage());
		
	} catch (ClassCastException ex2) {
		System.out.println(ex2.getMessage());
	
	} catch (NullPointerException ex3) {
		System.out.println(ex3.getMessage());
		
	}catch (IllegalArgumentException ex4) {
		System.out.println(ex4.getMessage());
		
	}catch (IllegalStateException ex5) {
		System.out.println(ex5.getMessage());
	}

	
	
	// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
	Map<Integer, String> nombreMap = new HashMap<Integer, String>();
	nombreMap.size(); // Devuelve el numero de elementos del Map
	nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
	nombreMap.put(K clave, V valor); // Añade un elemento al Map
	nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
	nombreMap.clear(); // Borra todos los componentes del Map
	nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
	nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
	nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
	nombreMap.values(); // Devuelve una "Collection" con los valores del Map
	
	
	
	import java.util.HashMap;
	import java.util.Map;

	class Alumno {
	    private String id;
	    private String nombre;
	    private int edad;

	    public Alumno(String id, String nombre, int edad) {
	        this.id = id;
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getId() { return id; }
	    public String getNombre() { return nombre; }
	    public int getEdad() { return edad; }

	    @Override
	    public String toString() {
	        return "Alumno{id='" + id + "', nombre='" + nombre + "', edad=" + edad + "}";
	    }
	}

	public class EjemploHashMapAlumnos {
	    public static void main(String[] args) {
	        // HashMap<Clave, Valor>
	        Map<String, Alumno> alumnos = new HashMap<>();

	        // 1) Agregar alumnos (put)
	        alumnos.put("A001", new Alumno("A001", "Ana", 20));
	        alumnos.put("A002", new Alumno("A002", "Luis", 22));
	        alumnos.put("A003", new Alumno("A003", "Marta", 19));

	        // 2) Obtener un alumno por ID (get)
	        Alumno a = alumnos.get("A002");
	        System.out.println("Alumno A002: " + a);

	        // 3) Verificar si existe una clave (containsKey)
	        System.out.println("¿Existe A004? " + alumnos.containsKey("A004"));

	        // 4) Recorrer el HashMap (entrySet)
	        System.out.println("\nLista completa:");
	        for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
	            String id = entry.getKey();
	            Alumno alumno = entry.getValue();
	            System.out.println(id + " -> " + alumno);
	        }

	        // 5) Eliminar un alumno (remove)
	        alumnos.remove("A001");
	        System.out.println("\nDespués de eliminar A001: " + alumnos.keySet());
	    }
	}
	
	
	
}
