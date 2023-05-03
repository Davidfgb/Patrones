package Cadena_responsabilidad;

public class Main {
	    public static void main(String[] args) {

	        ManejadorAyuda m1 = new Boton();
	        ManejadorAyuda m2 = new Aplicacion();
	        ManejadorAyuda m3 = new Pantalla();

	        m1.setSucesor(m2);
	        m2.setSucesor(m3);
	        m1.ayuda(new Peticion("Negativo ", -1));
	        m2.ayuda(new Peticion("Positivo ", 0));
	        m1.ayuda(new Peticion("Positivo ", 3));
	  
	    }

}