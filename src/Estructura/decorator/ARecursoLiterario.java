package Estructura.decorator;

public abstract class ARecursoLiterario extends ATexto {
	
	ATexto escrito;

	public ARecursoLiterario(ATexto escrito, String texto) {
		super(texto);
		this.escrito = escrito;
	}
 
	public void expresar() {
		System.out.println(escrito.getTexto());
	}

}
