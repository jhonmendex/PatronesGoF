package Creacion.FabricaAbs;

public class FabricaDeMuebles extends AFabricaDeBien {

    @Override
    public AProducto crearProducto() {
        return new Mueble();
    }

    @Override
    public AServicio crearServicio() {
        return new Restauracion();
    }

}
