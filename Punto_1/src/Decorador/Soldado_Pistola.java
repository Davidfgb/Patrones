package Decorador;



public class Soldado_Pistola extends SoldadoRazo {




	public Soldado_Pistola(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
    int Defensa() {
        return super.Defensa();
    }

    @Override
    int Atque() {
        return super.Atque()*2;
    }
    
    @Override
    int Movimento() {
        return super.Movimento();
    }
}
