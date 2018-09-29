package Estructura.Adapter;

public class SillaElectrica implements ISilla {

    Electricidad voltaje;

    public SillaElectrica(Electricidad voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public void acomodar() {
        System.out.println("Acomodado");
        voltaje.electoructar();
    }
}
