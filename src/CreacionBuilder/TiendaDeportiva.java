package CreacionBuilder;

public class TiendaDeportiva extends ATienda<String>{
    String traje="";
	@Override
	public void vendeCalzado() {
		traje+="tenis ";
		System.out.println("tenis");
	}
	@Override
	public void vendeAjuar() {
		traje+="pantaloneta sudadera camiseta ";
		System.out.println("pantaloneta sudadera camiseta ");
	}
	@Override
	public void vendeAccesorios() {
		traje+="valaca manilla reloj";
		System.out.println("valaca manilla");
	}
	@Override
	public String getTraje() {		
		return traje;
	}		
}
