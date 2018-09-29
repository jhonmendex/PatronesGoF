package Creacion.FabricaAbs;

public class Prueba {

    public void probar() {
        Organizacion intel = new Organizacion();
        intel.setFabrica(new FabricaDeSoftware());
        intel.cargarBien();

        Organizacion muebles = new Organizacion();
        muebles.setFabrica(new FabricaDeMuebles());
        muebles.cargarBien();
    }

    public static void main(String[] args) {
        new Prueba().probar();
    }

}
