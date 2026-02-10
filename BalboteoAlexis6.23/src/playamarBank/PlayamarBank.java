package playamarBank;

import java.time.LocalDate;


/**
 * Representa una cuenta bancaria del sistema PlayamarBank.
 * <p>
 * Permite realizar operaciones como ingresos, retiradas y transferencias,
 * aplicando las restricciones de saldo, descubierto y embargo definidas.
 * </p>
 */

public class PlayamarBank {
	
	// Atributos de clase constantes
	
	
	
	/**
	 * Descubierto máximo permitido al crear una cuenta por defecto :
	 * {@value MAX_DESCUBIERTO_DEFAULT} euros.
	 */
	public static final double MAX_DESCUBIERTO_DEFAULT = 0.0;
	
	
	
	/**
	 * Saldo por defecto :
	 * {@value DEFAULT_SALDO} euros.
	 */
	public static final double DEFAULT_SALDO = 0.0;
	
	
	/**
	 * Saldo maximo :
	 * {@value SALDO_MAX} euros.
	 */
	public static final double SALDO_MAX = 999999999999.999;
	
	
	/**
	 * Definicion de la fecha mas antigua que se puede crear una cuenta :
	 * {@link FECHA_MAS_ANTIGUA_POSIBLE} fecha.
	 */
	public static final LocalDate FECHA_MAS_ANTIGUA_POSIBLE = LocalDate.of(1950, 1, 1);
	
	/**
	 * Numero maximo de cuentas que permite crear al año :
	 * {@value NUM_MAX_CUENTAS} numero.
	 */
	
	public static final int NUM_MAX_CUENTAS = 9999;

		

	// Atributos de clase variables

	
	private static int anho = LocalDate.now().getYear();
	private static int numConsecutivo = 0; 
	
	
	// Atributos de objeto inmutables
	
	

	// Atributos de objeto variables
	
	private String id;    // debe ser final
	private double saldo;
	private double dineroEmbargado;
	private LocalDate fechaCreacion;
	private double limiteDescubierto;
	private double saldoMax;
	private double totalIngresado;

	
		

	// constructores

	//Constructor con todos los parametros
	/**
	 * Constructor con tres parámetros
	 *
	 * @param saldo Saldo inicial de la cuenta (en euros)
	 * @param fechaCreacion Fecha de creación de la cuenta
	 * @param limiteDescubierto Límite de descubierto de lacuenta (en euros)
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	
	
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
	/**
	 * Constructor con dos parámetros
	 *
	 * @param saldo Saldo inicial de la cuenta (en euros)
	 * @param fechaCreacion Fecha de creación de la cuenta
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldo,LocalDate fechaCreacion)  {
		
		this(saldo,fechaCreacion,MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	//constructor con 1 parametros
	/**
	 * Constructor con un parámetros
	 *
	 * @param saldo Saldo inicial de la cuenta (en euros)
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldo) {
		
		this(saldo,LocalDate.now(),MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	
	//constructor sin parametros
	/**
	 * Constructor sin parámetros
	 */
	public PlayamarBank() {
		
		this(DEFAULT_SALDO,LocalDate.now(),MAX_DESCUBIERTO_DEFAULT);
					
	}
	
	
	
	//Metodos
	
	
	/**
	 * Genera un nuevo id
	 *
	 * @return generar un nuevo id
	 */
	
	private String generarId() throws IllegalStateException {
		
		if(numConsecutivo >= NUM_MAX_CUENTAS) {
			throw new IllegalStateException("Limite de cuentas creadas este año");
		}
		
		
		String id;
		
		id = String.format("%04d-%04d", (int) anho, numConsecutivo);
		
		numConsecutivo++;
		
		return id;
	}
	
	
	/**
	 * Embarga la cuenta con cierta cantidad
	 *
	 * @param cantidad Cantidad que se embarga
	 * @throws IllegalArgumentException Si la cantidad de ingreso es inválida.
	 * 
	 */
	
	
	public void embargo(double cantidad)throws IllegalArgumentException {
		if(cantidad>this.saldo) {
			throw new IllegalArgumentException("No hay dinero que embargar");
		}
		if(cantidad<0) {
			throw new IllegalArgumentException("cantidad erronea");
		}
		
		this.dineroEmbargado = cantidad;
		this.limiteDescubierto = 0;
		
	}
	
	/**
	 * Desembarga cierta cantidad de la cuenta 
	 *
	 * @param cantidad Cantidad que se desembarga
	 * 
	 * @throws IllegalArgumentException Si la cantidad de desembargo es inválida.
	 */
	
	public void desembargar(double cantidad)throws IllegalArgumentException {
		if(cantidad>this.dineroEmbargado) {
			throw new IllegalArgumentException("no hay tanto embargado");
		}
		if(cantidad<0) {
			throw new IllegalArgumentException("cantidad erronea");
		}
		
		this.dineroEmbargado = this.dineroEmbargado - cantidad;
		
		
	}
	
	/**
	 * Extrae dinero de la cuenta
	 *
	 * @param cantidad Cantidad que se extrae
	 * 
	 * @throws IllegalArgumentException Si la cantidad que se extrae es inválida.
	
	 */
	
	public void extraer(double cantidad)throws IllegalArgumentException {
		if(cantidad + this.limiteDescubierto> this.saldo) {
			throw new IllegalArgumentException("No puedes retirar mas de lo que tienes");
		}
		if(cantidad<0) {
			throw new IllegalArgumentException("cantidad erronea");
		}
		if(isEmbargada()) {
			
			if(this.dineroEmbargado - this.saldo < cantidad) {
				
				throw new IllegalArgumentException("no puedes sacar esa cantidad por que tienes dinero embargado");
			}
			
		}
		
		
		
		this.saldo = this.saldo - cantidad;
		
		
	}
	
	
	/**
	 * Ingresa dinero en la cuenta
	 * 
	 * @param cantidad Cantidad que se ingresa
	 * 
	 * @throws IllegalArgumentException Si la cantidad que se extrae es erronea .
	 * 
	 */
	
	public void ingresar(double cantidad)throws IllegalArgumentException {
		if(cantidad> SALDO_MAX-this.saldo) {
			throw new IllegalArgumentException("No puedes ingresar, superas el limite de la cuenta");
		}
		if(cantidad<0) {
			throw new IllegalArgumentException("cantidad erronea");
		}
		
		this.saldo = this.saldo + cantidad;
		
		if(this.saldoMax > this.saldo) {
			this.saldoMax = this.saldo;
		}
		
		this.totalIngresado += cantidad;
		
		
	}
	
	/**
	 * Transfiere dinero de una cuenta a otra
	 * 
	 * @param cantidad Cantidad que se quiere transferir
	 * @param destino Es la cuenta a donde se envia el dinero
	 * 
	 * 
	 * @throws IllegalStateException Si la cantidad que se transfiere es erronea .
	 * @throws IllegalArgumentException Si no existe la cuenta destino
	 */
	
	
	public void transferir(double cantidad, PlayamarBank destino)
			throws IllegalArgumentException, IllegalStateException {
		if(this.saldo + this.limiteDescubierto + this.dineroEmbargado <cantidad) {
			throw new IllegalStateException("no hay tanto dinero para transferir");
		}
		if(destino == null) {
			throw new IllegalArgumentException("no existe la cuenta destino");
		}
		
		destino.saldo = destino.saldo + cantidad;
		this.saldo =  this.saldo - cantidad;
		
		if(destino.saldoMax > destino.saldo) {
			destino.saldoMax = destino.saldo;
		}
		
	}
	
	/**
	 * Transfiere todo el dinero a otra cuenta
	 * 
	 * @param destino Es la cuenta a donde se envia el dinero
	 * 
	 * 
	 * @throws IllegalArgumentException Si no existe la cuenta destino
	 * 
	 */
	
	
	public void transferir( PlayamarBank destino) throws IllegalArgumentException {
		if(destino == null) {
			throw new IllegalArgumentException("no existe la cuenta destino");
		}
		destino.saldo = destino.saldo + this.saldo -  this.dineroEmbargado;
		this.saldo = this.dineroEmbargado;
		
		if(destino.saldoMax > destino.saldo) {
			destino.saldoMax = destino.saldo;
		}
		
	}

	
	
	//getters
	
	

	/**
	 * Obtenemos el numero de dias que la cuenta lleva activa
	 *
	 * @return dias que la cuentas lleva activa
	 */
	
	
	public int getDiasCuenta() {
		int dias;
		
		dias = LocalDate.now().getDayOfYear() - this.fechaCreacion.getDayOfYear()  ;
		
		if(this.fechaCreacion.getYear() != LocalDate.now().getYear()) {
			
		int num = 	LocalDate.now().getYear() - this.fechaCreacion.getYear();
		
		dias = dias + (num*365);
			
			
		}
		
		return dias;
	}
	
	/**
	 * Obtenemos la fecha de creacion de la cuenta
	 *
	 * @return fecha de creacion de la cuenta
	 */
		
	public LocalDate getFechaCreacion() {
		
		return this.fechaCreacion;
	}
	

	/**
	 * Obtenemos el id de la cuenta
	 *
	 * @return id de la cuenta
	 */
	public String getId() {
		return this.id;
	}
	/**
	 * Obtenemos el limite descubierto de la cuenta
	 *
	 * @return limite descubierto de la cuenta
	 */
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	/**
	 * Obtenemos el dinero que está embargado de la cuenta
	 *
	 * @return dinero embargado
	 */

	public double getDineroEmbargado() {
		return dineroEmbargado;
	}
	/**
	 * Obtenemos el saldo de la cuenta
	 *
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Obtenemos el mayor saldo que la cuenta ha tenido a lo largo del tiempo
	 *
	 * @return saldo maximo
	 */
	public double getSaldoMaximo() {
		return this.saldoMax;
	}
	/**
	 * Obtenemos el total de dinero ingresado en la cuenta
	 *
	 * @return ingresos totales
	 */
	
	public double getTotalIngresado() {
		return this.totalIngresado;
	}
	
	/**
	 * Obtenemos si la cuenta esta al descubierto
	 *
 	 * @return <code>verdadero</code> si es saldo de la cuenta es negativo;
     * <code>falso</code> si el saldo es 0 o positivo.
	 */
	
	public boolean isDescubierta() {
		
		boolean saldoNegativo;
		
		if(this.saldo<0) {
			saldoNegativo = true;
		}else {
			saldoNegativo = false;
		}
		
		
		return saldoNegativo;
	}
	
	
	/**
	 * Obtenemos se la cuenta está embargada
	 *
 	 * @return <code>verdadero</code> si está embargada ;
     * <code>falso</code> si no está embargada.
	 */
	
	public boolean isEmbargada() {
		
		boolean embargada = false;
		
		if(this.dineroEmbargado>0) {
			embargada = true;
		}
		
		return embargada;
		
	}
	
	
	
	// metodos estaticos
	/**
	 * Obtenemos el numero de cuentas embargadas
	 *
 	 * @return numero de cuentas embargadas.
	 */
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
