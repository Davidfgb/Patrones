package fabrica_abstracta;


interface CuentaFactory {

	CuentaJoven makeCuentaJoven();
	Cuenta10 makeCuenta10 ();
	CuentaOro makeCuentaOro ();
	CuentaEstandar makeCuentaEstandar();

}
