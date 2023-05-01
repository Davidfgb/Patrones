package composite;

public class Main {
    public static void main(String[] args) {
        
        Objeto Objeto1 = new Objeto();
        Objeto Objeto2 = new Objeto();

     
        Compuesto grupo1 = new Compuesto();
        grupo1.agregar(Objeto1);
        grupo1.agregar(Objeto2);

        
        Compuesto grupo2 = new Compuesto();
        Objeto Objeto3 = new Objeto();
        grupo2.agregar(grupo1);
        grupo2.agregar(Objeto3);

  
        grupo2.operacion();
               
        
       
    }
    
}
