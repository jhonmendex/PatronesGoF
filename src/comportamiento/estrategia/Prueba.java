package inv.logica.patrones.comportamiento.estrategia;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	LLave llave=new LLave();
    	Puerta puerta=new Puerta(llave);
    	puerta.abrir();
    	puerta.setAcceso(new SensorDeHuella());
    	puerta.abrir();
    	puerta.setAcceso(new SensorDeMovimiento());
    	puerta.abrir();
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
