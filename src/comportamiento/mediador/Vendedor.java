package inv.logica.patrones.comportamiento.mediador;

/** @author Sandro Bolaños */

public class Vendedor extends ANegociador {
	int minimoDeRebaja;
	int rebaja;    
	public Vendedor(Tienda tienda,int precio){
		negocio=tienda;
		tienda.vendedor=this;
		oferta=100;
		minimoDeRebaja = (int)(precio*0.1);
		rebaja = Math.round(minimoDeRebaja/10f);
	}
	@Override
	public void recibirOferta(int nuevoPrecio) {
		if(nuevoPrecio<=oferta-minimoDeRebaja||nuevoPrecio<=oferta-rebaja){
		   oferta-=rebaja; 
		   System.out.println("se lo vendo  en "+oferta);
		   super.negociar();		  
		}else{
		   System.out.println("vendido en "+nuevoPrecio);
		}
	}
}