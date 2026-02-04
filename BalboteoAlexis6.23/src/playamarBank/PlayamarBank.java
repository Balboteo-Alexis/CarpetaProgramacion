package playamarBank;

import java.time.LocalDate;

public class PlayamarBank {
	
	// Atributos de clase constantes
	public static final double MAX_DESCUBIERTO_DEFAULT = 0.0;
	public static final double DEFAULT_SALDO = 0.0;
	public static final double SALDO_MAX = 999999999999.999;
	public static final LocalDate FECHA_MAS_ANTIGUA_POSIBLE = LocalDate.of(1950, 1, 1);
	public static final int 	NUM_MAX_CUENTAS = 9999;

		

	// Atributos de clase variables

	
	private static int anho = LocalDate.now().getYear();
	private static int numConsecutivo = 0; 
	
	
	// Atributos de objeto inmutables
	
	

	// Atributos de objeto variables
	
	private String id;
	private double saldo;
	private double dineroEmbargado;
	private LocalDate fechaCreacion;
	private double limiteDescubierto;
	private double saldoMax;
	private double totalIngresado;

	
		

	// constructores

	//Constructor con todos los parametros
	public PlayamarBank(double saldo,LocalDate fechaCreacion, double limiteDescubierto ) throws IllegalArgumentException {
		
		if(saldo<0 || saldo >SALDO_MAX ) {
			throw new IllegalArgumentException("Saldo incorrecto");
		}
		if(fechaCreacion.getYear() < FECHA_MAS_ANTIGUA_POSIBLE.getYear()   ) {
			throw new IllegalArgumentException("Fecha de creacion incorrecta");
		}
		if(limiteDescubierto>MAX_DESCUBIERTO_DEFAULT ) {
			throw new IllegalArgumentException("limite deescubierto incorrecto");
		}
		
		this.saldo = saldo;
		this.fechaCreacion = fechaCreacion;
		this.limiteDescubierto = limiteDescubierto;
		
		this.dineroEmbargado = 0;
		this.id = generarId();
		this.saldoMax = this.saldo;
		this.totalIngresado = 0;
		
					
	}
	//constructor con 2 parametros
	
	public PlayamarBank(double saldo,LocalDate fechaCreacion)  {
		
		this(saldo,fechaCreacion,MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	//constructor con 1 parametros
	
	public PlayamarBank(double saldo) {
		
		this(saldo,LocalDate.now(),MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	
	//constructor sin parametros
	
	public PlayamarBank() {
		
		this(DEFAULT_SALDO,LocalDate.now(),MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	
	
	//Metodos
	
	private String generarId() throws IllegalArgumentException {
		
		if(numConsecutivo >= NUM_MAX_CUENTAS) {
			throw new IllegalStateException("Limite de cuentas creadas este año");
		}
		
		
		String id;
		
		id = String.format("%04d-%04d", (int) anho, numConsecutivo);
		
		numConsecutivo++;
		
		return id;
	}
	
	
	public void embargo(double cantidad)throws IllegalArgumentException {
		if(cantidad>this.saldo) {
			throw new IllegalStateException("No hay dinero que embargar");
		}
		if(cantidad<0) {
			throw new IllegalStateException("cantidad erronea");
		}
		
		this.dineroEmbargado = cantidad;
		this.limiteDescubierto = 0;
		
	}
	
	public void desembargar(double cantidad)throws IllegalArgumentException {
		if(cantidad>this.dineroEmbargado) {
			throw new IllegalStateException("no hay tanto embargado");
		}
		if(cantidad<0) {
			throw new IllegalStateException("cantidad erronea");
		}
		
		this.dineroEmbargado = this.dineroEmbargado - cantidad;
		
		
	}
	public void extraer(double cantidad)throws IllegalArgumentException {
		if(cantidad + this.limiteDescubierto> this.saldo) {
			throw new IllegalStateException("No puedes retirar mas de lo que tienes");
		}
		if(cantidad<0) {
			throw new IllegalStateException("cantidad erronea");
		}
		if(isEmbargada()) {
			
			if(this.dineroEmbargado - this.saldo < cantidad) {
				
				throw new IllegalStateException("no puedes sacar esa cantidad por que tienes dinero embargado");
			}
			
		}
		
		
		
		this.saldo = this.saldo - cantidad;
		
		
	}
	
	public void ingresar(double cantidad)throws IllegalArgumentException {
		if(cantidad> SALDO_MAX-this.saldo) {
			throw new IllegalStateException("No puedesingresar, superas el limite de la cuenta");
		}
		if(cantidad<0) {
			throw new IllegalStateException("cantidad erronea");
		}
		
		this.saldo = this.saldo + cantidad;
		
		if(this.saldoMax > this.saldo) {
			this.saldoMax = this.saldo;
		}
		
		this.totalIngresado += cantidad;
		
		
	}
	public void transferir(double cantidad, PlayamarBank destino) {
		if(this.saldo + this.limiteDescubierto + this.dineroEmbargado <cantidad) {
			throw new IllegalStateException("no hay tanto dinero para transferir");
		}
		
		destino.saldo = destino.saldo + cantidad;
		this.saldo =  this.saldo - cantidad;
		
		if(destino.saldoMax > destino.saldo) {
			destino.saldoMax = destino.saldo;
		}
		
		
		
	}
	public void transferir( PlayamarBank destino) {
		
		destino.saldo = destino.saldo + this.saldo -  this.dineroEmbargado;
		this.saldo = this.dineroEmbargado;
		
		if(destino.saldoMax > destino.saldo) {
			destino.saldoMax = destino.saldo;
		}
		
	}

	
	
	//getters
	
	public int getDiasCuenta() {
		int dias;
		
		dias = LocalDate.now().getDayOfYear() - this.fechaCreacion.getDayOfYear()  ;
		
		if(this.fechaCreacion.getYear() != LocalDate.now().getYear()) {
			
		int num = 	LocalDate.now().getYear() - this.fechaCreacion.getYear();
		
		dias = dias + (num*365);
			
			
		}
		
		return dias;
	}
	
	
	
	public LocalDate getFechaCreacion() {
		
		return this.fechaCreacion;
	}
	
	
	public String getId() {
		return this.id;
	}
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	

	public double getDineroEmbargado() {
		return dineroEmbargado;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getSaldoMaximo() {
		return this.saldoMax;
	}
	
	
	public double getTotalIngresado() {
		return this.totalIngresado;
	}
	
	public boolean isDescubierta() {
		
		boolean saldoNegativo;
		
		if(this.saldo<0) {
			saldoNegativo = true;
		}else {
			saldoNegativo = false;
		}
		
		
		return saldoNegativo;
	}
	
	public boolean isEmbargada() {
		
		boolean embargada = false;
		
		if(this.dineroEmbargado>0) {
			embargada = true;
		}
		
		return embargada;
		
	}
	
	
	
	// metodos estaticos
	
	public static int getNumCuentasEmbargadas() {
		
		int num = 0;
		
		
		
		return num;
		
	}
	
	
	
	
	
	
	
	
	

	public String toString() {
		
		String frase;
		
		frase =  "PlayamarBank [id=" + id + ", saldo=" + saldo + ", dineroEmbargado=" + dineroEmbargado 
				+ ", fechaCreacion=" + fechaCreacion + ", limiteDescubierto=" + limiteDescubierto + "]";
		
		
		
		return frase;
	}
	
	
	
	
	
	

}
