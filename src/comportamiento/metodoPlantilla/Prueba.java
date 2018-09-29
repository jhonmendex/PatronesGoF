package inv.logica.patrones.comportamiento.metodoPlantilla;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	ADeportista james=new Futbolista();
    	ADeportista nairo = new Ciclista();
    	
    	james.relizarDeporte();
    	nairo.relizarDeporte();
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
