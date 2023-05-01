package Decorador;



public class Soldado_Escudo extends SoldadoRazo {
	



	public Soldado_Escudo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
    int Defensa() {
        return super.Defensa()*2;
    }
	
	 @Override
	 int Atque() {
	        return super.Atque();
	 }
	    
	 @Override
	 int Movimento() {
	   return super.Movimento();
	 }

	
    

}