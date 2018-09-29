package Estructura.decorator;

 
public class Escrito extends ATexto {

	public Escrito(String texto) {
		super(texto);
	}

	@Override
	public void expresar() {
		System.out.println(getTexto());
	}
}
