package Estructura.decorator;

 
public class Metafora extends ARecursoLiterario {

            public Metafora(ATexto escrito, String texto) {
		super(escrito, texto);
	}
	
	@Override
	public void expresar(){
		super.expresar();
		System.out.println(getTexto());
	}

}
