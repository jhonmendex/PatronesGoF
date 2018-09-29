package inv.logica.patrones.comportamiento.mediador;

/** @author Sandro Bolaños */

public class Comprador extends ANegociador {   
	int incremento;
	public Comprador(Tienda tienda,int precio){
		negocio = tienda;
		tienda.comprador=this;
		oferta = (int)(0.8*precio);
		incremento = Math.round(oferta/10f);
	}
    @Override
	public void recibirOferta(int nuevoPrecio) {
		if(nuevoPrecio>oferta&&nuevoPrecio>(oferta+incremento)){
		   oferta+=incremento; 
		   System.out.println("se lo compro en "+oferta);
		   super.negociar();
        }else{
           System.out.println("comprado en "+nuevoPrecio);	   
		}	
	}
}
