package Estructura.decorator;
 
public class Simil extends ARecursoLiterario {
 
    public Simil(ATexto escrito, String texto) {
        super(escrito, texto);
    }

    @Override
    public void expresar() {
        super.expresar();
        System.out.println(getTexto());
    }

}
