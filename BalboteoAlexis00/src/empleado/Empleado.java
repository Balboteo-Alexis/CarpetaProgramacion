package empleado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado {

	
		
		// Atributos de clase constantes
		public static final short SALARIO_DEFAULT = 900;
		public static final short HORAS_EXTRA_DEFAULT = 10;
		public static final byte IRPF_DEFAULT = 12;

		
		
		// Atributos de clase variables


		// Atributos de objeto inmutables
		

		// Atributos de objeto variables
		private short sueldoBase;
		private short pagoHExtra;
		private short horasExtrasRealizadas;
		private byte hijos;
		private byte tipoIrfp;
		private boolean casado;
		private  String  nif;
		private  String  nombre;
		private  String  apellidos;
		
		
		


		public Empleado(short sueldoBase, short pagoHExtra, short horasExtrasRealizadas, byte hijos, byte tipoIrfp,
				boolean casado, String nif, String nombre, String apellidos) throws IllegalArgumentException {
			
			
			if(sueldoBase<SALARIO_DEFAULT) {
				throw new IllegalStateException("El minimo son 900 ");
				
			}
			if(pagoHExtra<HORAS_EXTRA_DEFAULT || pagoHExtra> 50) {
				throw new IllegalStateException("El minimo son 10 y maximo 50");
			}
			if(horasExtrasRealizadas>40 || horasExtrasRealizadas<0) {
				throw new IllegalStateException("El limite son 40 y minimo 0");
			}
			if(hijos<0) {
				throw new IllegalStateException("No puedes tener menos de 0 hijos");
			}
			if(tipoIrfp>100 || tipoIrfp<0) {
				throw new IllegalStateException("El IRPF varia entro 0 y 100");
			}
			
			if(!validarNif(nif)) {
				throw new IllegalStateException("NIF invalido");
			}
			
			
			
			this.sueldoBase = sueldoBase;
			this.pagoHExtra = pagoHExtra;
			this.horasExtrasRealizadas = horasExtrasRealizadas;
			this.hijos = hijos;
			this.tipoIrfp = tipoIrfp;
			this.casado = casado;
			this.nif = nif;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}





		public Empleado(String nif, String nombre, String apellidos) {
			this(SALARIO_DEFAULT,HORAS_EXTRA_DEFAULT,(byte)0,(byte)0,IRPF_DEFAULT,false,nif,nombre,apellidos);
		}
		
		
		
		//Getters
		
		public short getSueldoBase() {
			return this.sueldoBase;
		}









		public short getHorasExtrasRealizadas() {
			return this.horasExtrasRealizadas;
		}





		
		//Setters
		

		public void setSueldoBase(short sueldoBase) throws IllegalStateException{
			
			if(sueldoBase<SALARIO_DEFAULT) {
				throw new IllegalStateException("El minimo son 900");
			}
			
			this.sueldoBase = sueldoBase;
		}


		public void setHorasExtrasRealizadas (short horasExtrasRealizadas)throws IllegalStateException {
			
			if(horasExtrasRealizadas>40 || horasExtrasRealizadas<0) {
				throw new IllegalStateException("El limite son 40 y minimo 0");
			}
			this.horasExtrasRealizadas = horasExtrasRealizadas;
		}

		
		
		//metodos
		
		
		
		public boolean  validarNif(String nif) {
			
			boolean valido= false;
			Pattern patron = Pattern.compile("[1-9]{8}[A-Z]{1}");
			
			Matcher coinciden = patron.matcher(nif);
			
			valido = coinciden.matches();
			
			return valido;
		}
		





		public double complementoExtras() {
			double dinero;
			
			
			dinero= (double) this.horasExtrasRealizadas * this.pagoHExtra;
			
			return dinero;
			
		}
		
		public double sueldoBruto() {
			double bruto;
			bruto = this.sueldoBase * (1 - (this.tipoIrfp*0.010));
			
			bruto = bruto + complementoExtras();
			
			return bruto;
		}
		
		public byte retenciones() {
			byte retencion;
			retencion = this.tipoIrfp;
			
			if (this.casado) {
				retencion--;
				retencion--;
			}
			if(this.hijos>0) {
				byte hijos = this.hijos;
				while(hijos>0) {
					retencion--;
					hijos--;
				}
			}
			return retencion;
			
			
		}



		public String verEmpleado() {
			String info;
			info = String.format("%s, %s, con DNI: %s.",
					    this.nombre,
					    this.apellidos, 
					    this.nif );
			
			
			return  info;
			}

		public String verTodoEmpleado() {
			String info;
			info = String.format("%s, %s, con DNI: %s.%nSu sueldo es de: %d, "
					+ "el complemento por horas extra: %d, el sueldo bruto: %d, la retención de IRPF: %d %%"
					+ ", el sueldo neto: %d",
					    this.nombre,
					    this.apellidos, 
					    this.nif,
					    this.sueldoBase,
					    complementoExtras(),
					    sueldoBruto(),
					    retenciones(),
					    this.sueldoBase);
			
			
			return  info;
			}
	
		
		public void copia(Empleado trabajador) {
			
			this.sueldoBase = trabajador.sueldoBase;
			this.pagoHExtra = trabajador.pagoHExtra;
			this.horasExtrasRealizadas = trabajador.horasExtrasRealizadas;
			this.hijos = trabajador.hijos;
			this.tipoIrfp = trabajador.tipoIrfp;
			this.casado = trabajador.casado;
			this.nif = trabajador.nif;
			this.nombre = trabajador.nombre;
			this.apellidos = trabajador.apellidos;
			
			
			
		}





		

}
