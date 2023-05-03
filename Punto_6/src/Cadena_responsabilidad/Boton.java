package Cadena_responsabilidad;

class Boton extends ManejadorAyuda {
	  
	public void ayuda(Peticion peticion) {
	        if (peticion.getValue() < 0) {
	            System.out.println("Los valores negativos son manejados por " + getClass().getSimpleName());
	            System.out.println("Valores peticion : " + peticion.getDescripcion() + peticion.getValue());
	        } else {
	            sucesor.ayuda(peticion);
	        }
	    }
}