package Cadena_responsabilidad;

abstract class ManejadorAyuda {
	
	ManejadorAyuda sucesor;
 
   
  

    void setSucesor(ManejadorAyuda sucesor) {
        this.sucesor = sucesor;
    }

    abstract void ayuda(Peticion peticion);
}