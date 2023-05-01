package fabrica_abstracta;

abstract class Cuenta {
    protected String tipoCuenta;
    protected double interes;
    protected String regalo;
    protected String tarjetaDebito;
    protected double tarjetaCredito_precio;
    protected  int tarjetaCredito_porcentaje;
    

    public abstract void mostrarDetalles();
}

