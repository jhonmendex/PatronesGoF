package Creacion.FabricaAbs;

public class FabricaDeSoftware extends AFabricaDeBien {

    @Override
    public AProducto crearProducto() {
        return new Software();
    }

    @Override
    public AServicio crearServicio() {
        return new Capacitacion();
    }

}
