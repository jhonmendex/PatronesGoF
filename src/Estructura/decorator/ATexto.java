package Estructura.decorator;

 
public abstract class ATexto {
	private String texto;
	
	public ATexto(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public abstract void expresar();
}
