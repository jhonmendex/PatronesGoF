package inv.logica.patrones.comportamiento.mediador;

/** @author Sandro Bola�os */

public class Tienda implements INegocio {
    Comprador comprador;
    Vendedor vendedor;
	@Override
	public void proponerOfertas(ANegociador negociador) {
		if(negociador==comprador){
		   vendedor.recibirOferta(comprador.getOferta());
		}else{
		   comprador.recibirOferta(vendedor.getOferta());
		}
	}
}
