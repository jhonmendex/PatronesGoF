package inv.logica.patrones.comportamiento.comando;

/** @author Sandro Bolaños */

public class Boton {

	IComando comando;
	
	public Boton(IComando comando){
		this.comando = comando;
	}
	
	public void click(){
		comando.ejecutar();
	}
	
}
