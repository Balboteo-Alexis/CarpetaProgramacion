package ejercicio7;

public class Venta {

	private String mes;
	private int ventaCochesMes;

	public Venta(String mes, int ventaCochesMes) {
		this.mes = mes;
		this.ventaCochesMes = ventaCochesMes;
	}

	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getVentaCochesMes() {
		return this.ventaCochesMes;
	}

	public void setVentaCochesMes(int ventaCochesMes) {
		this.ventaCochesMes = ventaCochesMes;
	}

	@Override
	public String toString() {
		return "\nVenta [mes=" + mes + ", ventaCochesMes=" + ventaCochesMes + "]";
	}
	
	
	
	

}
