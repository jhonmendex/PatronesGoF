package Estructura.decorator;


public class Prueba {

	public static void main(String args[]){
		Escrito carta = new Escrito("Querida amiga");
		
                Metafora piropo = new Metafora(carta, "Tu amistad es limpia como agua de un páramo");
		piropo.expresar();
		carta.setTexto("");
                
		Simil semejanza = new Simil(carta, "Te asemejas a la mañana");
		semejanza.expresar();            
                carta.setTexto("");
                
                Epiteto caracteristica = new Epiteto(carta, " eres como el frio en la nieve");
                caracteristica.expresar();
	}
}
 