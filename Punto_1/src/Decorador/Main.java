package Decorador;


//Ejercicio 1: Decorador 



public class Main {
	
	 public static void main(String[] args) {
		 
	 		 	
		 	SoldadoRazo soldado_1 = new SoldadoRazo("Juan");
		 	System.out.println("Soldado Normal : " + soldado_1.toString() );
		        
		   
	        
		 	SoldadoRazo Soldado_2 = new Soldado_Pistola("Daniel");
	        System.out.println("Soldado Pistola : " + Soldado_2.toString());
	        
	        SoldadoRazo Soldado_3 = new Soldado_Escudo("Pablo");
	        System.out.println("Soldado Escudo: " + Soldado_3.toString());
	        
	        
	        Unidad Soldado_mejorado = new SoldadoDecorado("Juan",soldado_1);
	        System.out.println("Soldado Escudo y Pistola: " + Soldado_mejorado.toString());
	       
	        System.out.println(soldado_1.Atque());
	        
	    }

}


