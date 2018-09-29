package inv.logica.patrones.comportamiento.mediador;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	Tienda t=new Tienda();
		new Comprador(t,100);
		Vendedor vendedor=new Vendedor(t,100);	
		vendedor.negociar();
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
