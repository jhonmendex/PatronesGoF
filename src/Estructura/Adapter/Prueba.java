package Estructura.Adapter;

public class Prueba {

    public void probar() {
        new Condenado(new SillaElectrica(new Electricidad(500)));
    }

    public static void main(String[] args) {
        new Prueba().probar();
    }
}
