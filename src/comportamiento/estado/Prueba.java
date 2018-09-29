package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	
    }
	public static void main(String[] args) {
		Elevador e=new Elevador(new Detenido(1));		
		e.recibirPiso(5);
		e.recibirPiso(8);
		e.recibirPiso(3);
		e.recibirPiso(4);
	}
}
