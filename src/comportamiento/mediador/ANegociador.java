package inv.logica.patrones.comportamiento.mediador;

/** @author Sandro Bola�os */

public abstract class ANegociador {
	   INegocio negocio;
	   int oferta;
       public void negociar(){
    	      negocio.proponerOfertas(this);
       }
       public int getOferta() {   		
   		      return oferta;
   	   }       
       public abstract void recibirOferta(int oferta);
}
