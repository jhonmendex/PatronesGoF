package Creacion.FabricaAbs;

public abstract class ABien {

    public ABien() {
        System.out.println("creando un " + getClass().getSimpleName());
    }
}
