package fabrica_abstracta;

public class CuentaEstandar extends Cuenta {

	 public CuentaEstandar() {
	        tipoCuenta = "Cuenta 10";
	        interes = 0.5 ;
	        regalo = "No";
	        tarjetaDebito = "Gratuita";
	   
	        
	    }

	@Override
	public void mostrarDetalles() {
		 System.out.println("Tipo de cuenta: " + tipoCuenta);
	     System.out.println("Interés: " + interes + "%");
	     System.out.println("Tarjeta de débito: " + tarjetaDebito);
	     System.out.println("Tarjeta de crédito: " + " No "+  
	    		 " \nmillones "+ tarjetaCredito_porcentaje + " % nomina");
	     System.out.println("Regalo: " + regalo);
		
	}
}
