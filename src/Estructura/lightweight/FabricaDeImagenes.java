package Estructura.lightweight;
import java.util.HashMap;

  
 
public class FabricaDeImagenes {
	HashMap<String, IPresentable> imagenes = new HashMap<String, IPresentable>();
	
	IPresentable getImagen(String clave){
		IPresentable imagen = null;
		
		if(imagenes.containsKey(clave)){
			imagen = imagenes.get(clave);
		}else{
			imagen = new Imagen(clave);
			imagenes.put(clave, imagen);
		}
		return imagen;
	}
}
