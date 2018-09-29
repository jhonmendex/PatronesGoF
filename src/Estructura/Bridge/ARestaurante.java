package Estructura.Bridge;
public abstract class ARestaurante {
	IPublicidad publicidad;
	public void setPublicidad(IPublicidad publicidad) {
		this.publicidad = publicidad;
	}
	public void ofrecerMenu() {
		publicidad.anunciarMenu();
	}
} 
