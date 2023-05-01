package fabrica_abstracta;

public class CuentaOro extends Cuenta {
	 public CuentaOro() {
	        tipoCuenta = "Cuenta Oro";
	        interes = 1.5 ;
	        regalo = "Seguro";
	        tarjetaDebito = "Gratuita";
	        tarjetaCredito_precio = 0;
	        tarjetaCredito_porcentaje = 60;
	        
	    }

	@Override
	public void mostrarDetalles() {
		 System.out.println("Tipo de cuenta: " + tipoCuenta);
	     System.out.println("Interés: " + interes + "%");
	     System.out.println("Tarjeta de débito: " + tarjetaDebito);
	     System.out.println("Tarjeta de crédito: " + " Gratuita" +
	    		 " \nmillones "+ tarjetaCredito_porcentaje + " % nomina");
	     System.out.println("Regalo: " + regalo);
		
	}

}
