/*
========================
CHULETA JAVA COLLECTIONS
========================

LIST (ordenada, permite repetidos, acceso por índice)
- ArrayList<E>:
  Sirve para: lista general, get(i) rápido, recorrer, añadir al final.
  Úsalo cuando: necesitas índice y lees mucho.
- LinkedList<E>:
  Sirve para: muchas inserciones/eliminaciones en extremos; también Queue/Deque.
  Úsalo cuando: la usarás como cola/pila o trabajas mucho al inicio/final.

SET (NO repetidos)
- HashSet<E>:
  Sirve para: evitar duplicados rápido (contains/add/remove rápidos).
  Nota: NO mantiene orden.
  Importante: para objetos propios, definir equals() y hashCode() (ej: DNI).
- LinkedHashSet<E>:
  Sirve para: set sin duplicados + mantiene orden de inserción.
- TreeSet<E>:
  Sirve para: set sin duplicados + ordenado (Comparable o Comparator).
  Nota: “duplicado” si compare(a,b) == 0.

MAP (clave -> valor) (claves únicas)
- HashMap<K,V>:
  Sirve para: diccionario rápido (buscar por clave).
  Nota: no mantiene orden.
- LinkedHashMap<K,V>:
  Sirve para: map que mantiene orden de inserción (útil para imprimir en orden).
- TreeMap<K,V>:
  Sirve para: map ordenado por clave.
- Hashtable<K,V> (legacy):
  Sirve para: como HashMap sincronizado, normalmente no se usa hoy.

QUEUE / DEQUE (colas)
- ArrayDeque<E> (recomendado):
  Sirve para: cola FIFO y pila LIFO (push/pop/offer/poll).
- LinkedList<E>:
  Sirve para: implementar Queue/Deque si ya usas lista enlazada.
- PriorityQueue<E>:
  Sirve para: cola de prioridad (sale el menor/mayor según orden), NO FIFO.

ATAJOS DE EXAMEN
- Orden + repetidos + índice -> ArrayList
- Sin repetidos -> HashSet (o LinkedHashSet si importa el orden)
- Clave->valor -> HashMap (o TreeMap si necesitas orden por clave)
- Cola FIFO -> ArrayDeque
- Siempre sacar mínimo/máximo -> PriorityQueue
*/
public class ChuletaCollections {
    // Clase vacía: solo para pegar la chuleta en un .java sin errores.
}