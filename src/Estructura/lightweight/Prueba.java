package Estructura.lightweight;

public class Prueba {

	public void probar(){
		FabricaDeImagenes fabrica = new FabricaDeImagenes();
		IPresentable imagenUno = fabrica.getImagen("Ruta1");
		imagenUno.presentar(null, 10, 10);
		 
		IPresentable imagenDos = fabrica.getImagen("Ruta2");
		imagenDos.presentar(null, 20, 20);
		
		IPresentable imagenTres = fabrica.getImagen("Ruta1");
		imagenTres.presentar(null, 30, 30);
	}
	
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
