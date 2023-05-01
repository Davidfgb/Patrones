package fabrica_abstracta;

public class CuentaJoven extends Cuenta{

	 public CuentaJoven() {
	        tipoCuenta = "Cuenta Joven";
	        interes = 2;
	        regalo = "Cd Musica";
	        tarjetaDebito = "Gratuita";
	     
	        
	    }

	@Override
	public void mostrarDetalles() {
		 System.out.println("Tipo de cuenta: " + tipoCuenta);
	     System.out.println("Interés: " + interes + "%");
	     System.out.println("Tarjeta de débito: " + tarjetaDebito);
	     System.out.println("Tarjeta de crédito: "+" No ");
	     System.out.println("Regalo: " + regalo);
		
	}
	
	
}
