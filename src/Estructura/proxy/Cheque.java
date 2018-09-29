package Estructura.proxy;

public class Cheque extends APago {

    APago efectivo;

    public Cheque(APago efectivo) {
        this.efectivo = efectivo;
    }

    @Override
    public int pagar(){
        System.out.println("La cantidad nominal es " + efectivo.pagar());
        return efectivo.pagar();
    }
}
