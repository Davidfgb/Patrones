package prototipo;

public class monstruo extends personaje {

	
	public monstruo(String nombre, double altura, int peso, int inteligencia, String habilidad) {
		super(nombre, altura, peso, inteligencia, habilidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	    public personaje clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	


	
}
