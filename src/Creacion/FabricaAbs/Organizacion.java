//clase de fabrica
package Creacion.FabricaAbs;

public class Organizacion {

    AProducto producto;
    AServicio servicio;
    AFabricaDeBien fabrica;

    public AFabricaDeBien getFabrica() {
        return fabrica;
    }

    public void setFabrica(AFabricaDeBien fabrica) {
        this.fabrica = fabrica;
    }

    public void cargarBien() {
        producto = fabrica.crearProducto();
        servicio = fabrica.crearServicio();
    }
}
