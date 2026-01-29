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
				boolean casado, String nif, String nombre, String apellidos) throws IllegalStateException {
			
			
			if(sueldoBase<SALARIO_DEFAULT) {
				throw new IllegalStateException("El minimo son 900");
			}
			if(pagoHExtra<HORAS_EXTRA_DEFAULT) {
				throw new IllegalStateException("El minimo son 10");
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
		
		
		
		
		public boolean  validarNif(String nif) {
			
			boolean valido= false;
			Pattern patron = Pattern.compile("[1-9]{9}[A-Z]{1}");
			
			Matcher coinciden = patron.matcher(nif);
			
			valido = coinciden.matches();
			
			return valido;
		}
		

		
		//metodos
		
		

	

}
