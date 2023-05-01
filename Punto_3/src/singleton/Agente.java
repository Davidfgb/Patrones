package singleton;


public class Agente {

    private String nombre;
    private static Agente agente;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Agente(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Agente getSingletonInstance(String nombre) {
        if (agente == null){
            agente = new Agente(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase agente");
        }
        
        return agente;
    }
    
    // metodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
