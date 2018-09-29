package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bolaños */

public class Detenido extends AEstado {
	public Detenido(int pisoActual) {
		super(pisoActual);	
		detener();
	}
	@Override
	public AEstado moverse(int pisoPedido) {
		if(pisoPedido==pisoActual){
		   return detener();		   
		}else if(pisoPedido>pisoActual) {
		   return new Subiendo(pisoActual).moverse(pisoPedido);
		}else{
		   return new Bajando(pisoActual).moverse(pisoPedido);
		}
	}
	private AEstado detener() {
		System.out.println("detenido en "+pisoActual);	
		return this;
	}
}
