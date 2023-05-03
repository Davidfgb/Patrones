package Cadena_responsabilidad;

class Pantalla extends ManejadorAyuda {

	

    @Override
    public void ayuda(Peticion peticion) {
        if (peticion.getValue() == 0) {
            System.out.println("Los valores Iguales que 0 son manejados por " + getClass().getSimpleName());
            System.out.println("Valores peticion : " + peticion.getDescripcion() + peticion.getValue());
        } else {
            sucesor.ayuda(peticion);
        }
    }
}

