package fabrica_abstracta;

public class Cuenta10 extends Cuenta {
	
	 public Cuenta10() {
	        tipoCuenta = "Cuenta 10";
	        interes = 1 ;
	        regalo = "Reproductor CD";
	        tarjetaDebito = "Gratuita";
	        tarjetaCredito_precio = 1.8;
	        tarjetaCredito_porcentaje = 60;
	        
	    }

	@Override
	public void mostrarDetalles() {
		 System.out.println("Tipo de cuenta: " + tipoCuenta);
	     System.out.println("Interés: " + interes + "%");
	     System.out.println("Tarjeta de débito: " + tarjetaDebito);
	     System.out.println("Tarjeta de crédito: " + tarjetaCredito_precio+  
	    		 " \nmillones "+ tarjetaCredito_porcentaje + " % nomina");
	     System.out.println("Regalo: " + regalo);
		
	}

}
