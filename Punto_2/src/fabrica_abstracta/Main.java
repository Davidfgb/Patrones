package fabrica_abstracta;


public class Main {

	 public static void main(String[] args) {
		 
		Cuenta cuentaJovenFactory = (Cuenta) new CuentaJoven();
		cuentaJovenFactory.mostrarDetalles();
		
		Cuenta cuenta10Factory = (Cuenta) new CuentaJoven();
		cuenta10Factory.mostrarDetalles();
		
		Cuenta cuentaOroFactory = (Cuenta) new CuentaJoven();
		cuentaOroFactory.mostrarDetalles();
		
		Cuenta cuentaRstandarFactory = (Cuenta) new CuentaJoven();
		cuentaRstandarFactory.mostrarDetalles();
		
	
	    }
}
