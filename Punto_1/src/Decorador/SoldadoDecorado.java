package Decorador;



public class SoldadoDecorado extends SoldadoRazo {


 
	private SoldadoRazo Soldadodecorado;


	public SoldadoDecorado(String nombre, SoldadoRazo soldadodecorado) {
		super(nombre);
		Soldadodecorado = soldadodecorado;
	}

	int Defensa() {
        return super.Defensa()*2;
    }

    int Atque() {
        return super.Atque()*2;
    }
    
    int Movimento() {
        return Soldadodecorado.Movimento();
    }
    


}