package inv.logica.patrones.comportamiento.comando;

/** @author Sandro Bolaños */

public class Prueba {

	public void probar(){
		Aplicacion aplicacion = new Aplicacion();
		Boton menu [] = {
				new Boton(new ComandoDeAbrir(aplicacion)),
				new Boton(new ComandoDeCrear(aplicacion)),
				new Boton(()->{aplicacion.borrar();}),
		};
		
		for (Boton boton_i : menu) {
			boton_i.click();
		}
	}
	
	public static void main(String[] args) {
		new Prueba().probar();
	}
}