package prototipo;






abstract class personaje implements Cloneable{

	
    String nombre;
    double altura;
    int peso;
    int inteligencia;
    String habilidad;
	


	public personaje(String nombre, double altura, int peso, int inteligencia, String habilidad) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.inteligencia = inteligencia;
		this.habilidad = habilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	 public personaje clone() throws CloneNotSupportedException {
	        return (personaje) super.clone();
	    }

	 public String toString() {
	        return "Nombre Personaje: "+ getNombre() + 
	        		" \nAltura" + getAltura()+
	        		" \nPeso: " + getPeso() + 
	        		"  \nInteligencia: " + 
	        		getInteligencia() + 
	        		" \nHabilidad " + getHabilidad();
	    }
    
    
   
}
