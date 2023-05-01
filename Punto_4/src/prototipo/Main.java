package prototipo;


public class Main {

	 public static <K> void main(String[] args) throws CloneNotSupportedException {
	        
		 //BasicCar ford = new Ford("Ford Yellow");
	       // ford.price = 500000;
	     
	     
	      personaje Heroe_1 = new heroe("Juan", 180, 80, 10, "Fuerza");
	      System.out.println(Heroe_1.toString());
	      personaje principe;
	      principe = Heroe_1.clone();
	      
	      principe.setNombre("Jose");
	      principe.setHabilidad("Velocidad");
	      
	      System.out.println(principe.toString());
	      

	       
	    }

	
	
}
