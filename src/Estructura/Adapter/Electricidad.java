package Estructura.Adapter;

public class Electricidad {

    int voltaje;

    public Electricidad(int voltaje) {
        this.voltaje = voltaje;
    }

    public void electoructar() {
        if (voltaje >= 500) {
            System.out.println("electricidad ....");
        }
    }
   
}
