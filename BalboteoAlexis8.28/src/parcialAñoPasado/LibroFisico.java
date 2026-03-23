package parcialAñoPasado;

import java.time.LocalDate;

public class LibroFisico extends Libro {

	private int numeroPaginas;

	private boolean tapadura;

	public LibroFisico(String titulo, String autor, LocalDate fechaPublicacion, String genero, boolean disponibilidad,
			int numeroPaginas) {
		super(titulo, autor, fechaPublicacion, genero, disponibilidad);

		if (numeroPaginas < 0) {
			new IllegalArgumentException("Las paginas no pueden ser negativas");

		}

		this.numeroPaginas = numeroPaginas;
		this.tapadura = false;

	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public boolean isTapadura() {
		return tapadura;
	}
	
	
	
	
	
	
	
	
	

	@Override
	protected String generarId() {

		String id;

		id = String.format("%s-%s-%04d", "F",
				getGenero().substring(0, 2), getContador());

		return id;
	}

	@Override
	protected double calcularPrecio() {

		double resultado;

		resultado = (getNumeroPaginas() * 0.75);
		if (isTapadura()) {
			resultado += 3;
		}

		return resultado;
	}

	@Override
	public String toString() {
		return super.toString() + "LibroFisico [numeroPaginas=" + numeroPaginas + ", tapadura=" + tapadura + "]";
	}

}
