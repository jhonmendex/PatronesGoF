package Estructura.Adapter;

public class Condenado {

    ISilla silla;

    public Condenado(ISilla silla) {
        this.silla = silla;
        silla.acomodar();
    }
}
