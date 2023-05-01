package singleton;

public class Main {

    public static void main(String[] args) {
        
        Agente ricardo = Agente.getSingletonInstance("Ricardo Moya");
        Agente ramon = Agente.getSingletonInstance("Ramón Invarato");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());   
    }
}