package composite;

import java.util.ArrayList;

public class Compuesto implements Componente {
    private ArrayList<Componente> componentes;

    public Compuesto() {
        componentes = new ArrayList<Componente>();
    }

    public void agregar(Componente c) {
        componentes.add(c);
    }

    public void eliminar(Componente c) {
        componentes.remove(c);
    }

    public void operacion() {
        for (Componente c : componentes) {
            c.operacion();
        }
    }
}
