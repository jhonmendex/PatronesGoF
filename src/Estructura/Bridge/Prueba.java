package Estructura.Bridge;
public class Prueba {
	   void probar(){
		   RestauranteTipico restaurante = new RestauranteTipico();
		   restaurante.setPublicidad(new Voceador());
		   restaurante.ofrecerMenu();
		   restaurante.setPublicidad(()->{System.out.println("usando un panfleto");});
		   restaurante.ofrecerMenu();
		   restaurante.setPublicidad(()->{System.out.println("anunciar por radio");});
		   restaurante.ofrecerMenu();
		   restaurante.setPublicidad(new Patinadora());
		   restaurante.ofrecerMenu(); 
	   } 
       public static void main(String s[]){
    	   new Prueba().probar();
       }
}
