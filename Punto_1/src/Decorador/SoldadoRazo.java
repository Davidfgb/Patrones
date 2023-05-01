package Decorador;




public class SoldadoRazo implements Unidad {
	

	protected String nombre;
	
	public SoldadoRazo(String nombre) {
		super();
		this.nombre = nombre;
	}


    int Defensa() {
        return Defender;
    }

    int Atque() {
        return Atcar;
    }
    
    int Movimento() {
        return Moverse;
    }
    
    @Override
    public String toString() {
        return "{"+"Soldado: "+ nombre + " Defensa: " + Defensa() + "  Atque: " + Atque() + " Movimento " + Movimento()+ " } ";
    }
    
}