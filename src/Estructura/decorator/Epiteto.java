package Estructura.decorator;

 
public class Epiteto extends ARecursoLiterario {

	public Epiteto(ATexto escrito, String texto) {
		super(escrito, texto);
	}
	
	@Override
	public void expresar(){
		super.expresar();
		System.err.println(getTexto());
	}
}
