package jardinBotanico;

import java.util.ArrayList;
import java.util.HashSet;

/** Ejercicio 2. Búsqueda de especies de plantas populares
 * @author Profesor
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        ArrayList<String> lista1 = new ArrayList<String>();        
        
        ArrayList<String> lista2 = new ArrayList<String>();  
        
        ArrayList<String> listaEspeciesPopulares = new ArrayList<String>();  
        ArrayList<String> listaPosicionesPopulares = new ArrayList<String>(); 
        
        
        HashSet<String> especies = new HashSet<String>();

        for(int i = 0; i<10;i++) {
        	
        	lista1.add(Utilidades.especiePlantaAleatoria());
        	lista2.add(Utilidades.especiePlantaAleatoria());
        }
        
        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
        System.out.println("-----------------------------------------");
        
        
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        
        for(int i = 0; i<10;i++) {
        	
        	String p1,p2;
        	
        	p1 = lista1.get(i);
        	p2 = lista2.get(i);
        	
        	if(p1.equals(p2)) {
        		
        		listaEspeciesPopulares.add(p2);
        		especies.add(p2);
        		listaPosicionesPopulares.add(String.valueOf(i));
        		
        		
        		lista1.set(i,"*"+ p1+"*");
        		lista2.set(i,"*"+ p2+"*");
        		
        		
        		
        	}
        	
        	
        }
        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------

        
        
        
        // Recorremos a la vez las dos listas
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        System.out.println(lista1.toString());
        System.out.println(lista2.toString());
        System.out.println(especies.toString());
        System.out.println(listaPosicionesPopulares.toString());
    }
}