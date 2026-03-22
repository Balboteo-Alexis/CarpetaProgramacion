package ejercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

	private static int cont=0;
	
	
	private int codigoCliente;
	private String nombre;
	private String email;
	private ArrayList<String> telefono;
	private HashMap<String, Integer> compras;
	
	
	

	
	
	
	public Cliente( String nombre, String email, ArrayList<String> telefono,
			HashMap<String, Integer> compras) {
		this.codigoCliente = cont;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.compras = compras;
		
		cont++;
	}

	public void addTelefono(String telefono) throws IllegalArgumentException {

		for (String t : this.telefono) {

			if (t.equals(telefono)) {

				new IllegalArgumentException("Ya existe este telefono");

			}

		}

		this.telefono.add(telefono);

	}

	public String getTelefono(int indice) {

		String telefono;

		if (this.telefono.get(indice).isEmpty()) {
			telefono = "";
		} else {

			telefono = this.telefono.get(indice);
		}

		return telefono;

	}

	public ArrayList<String> buscarTelefono(String telefono) {

		ArrayList<String> telefonosCoincidentes = new ArrayList<String>();

		for (String i : this.telefono) {

			if (i.contains(telefono)) {

				telefonosCoincidentes.add(i);

			}

		}

		return telefonosCoincidentes;
	}

	public void addCompras(String producto, int cantidad) {

		if (this.compras.containsKey(producto)) {

			this.compras.put(producto, this.compras.get(producto) + cantidad);

		} else {

			this.compras.put(producto, cantidad);

		}

	}

	public void eliminarProducto(String producto) {
		
		
		this.compras.remove(producto);
		
	}
	
	public ArrayList<String> verProductos(){
		
		ArrayList<String> lista = new ArrayList<String>();
		
		
		for (Map.Entry<String, Integer> c : this.compras.entrySet()) {
			String key = c.getKey();
			
			lista.add(key);
			
		}
		
		
		Collections.sort(lista);
		
		
		return lista;
		
		
	}
	
	public int totalUnidades() {
		
		int resultado=0;
		
		for (Map.Entry<String, Integer> c : this.compras.entrySet()) {
			Integer value = c.getValue();
			
			resultado += value; 
			
			
		}
		
		
		
		return resultado;
		
	}

	@Override
	public String toString() {
		return "\nCliente [codigoCliente=" + codigoCliente + ", nombre=" + nombre + ", email=" + email + ", telefono="
				+ telefono + ", compras=" + compras + "]";
	}
	
	
	
	

}
