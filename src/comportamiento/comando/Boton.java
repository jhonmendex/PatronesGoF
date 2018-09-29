package inv.logica.patrones.comportamiento.comando;

/** @author Sandro Bola�os */

public class Boton {

	IComando comando;
	
	public Boton(IComando comando){
		this.comando = comando;
	}
	
	public void click(){
		comando.ejecutar();
	}
	
}
