package CreacionBuilder;
public class Comprador {
	    ATienda<String> tienda;
 
		public Comprador(ATienda<String> tienda){
			this.tienda = tienda;
		} 
		public void comprarTraje(){
        	   tienda.vendeAccesorios();
        	   tienda.vendeCalzado();
        	   tienda.vendeAjuar();
        	   System.out.println(tienda.getTraje());
        	 
         }
}
