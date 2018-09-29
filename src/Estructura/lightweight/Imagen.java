package Estructura.lightweight;
import javax.swing.ImageIcon;
 

public class Imagen implements IPresentable {
	String ruta;
	ImageIcon imagen;
	
	public Imagen(String ruta) {
		super();
		this.ruta = ruta;
		imagen = new ImageIcon(ruta);
	}
	
 
	public void presentar(Object gc, int x, int y) {
		System.out.println("Presentar imagen "+ruta+" en x:"+x+" y:"+y);
	}
	
}
