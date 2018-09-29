package Creacion.Singleton;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Calculadora {

    public static Calculadora calculadora = new Calculadora();
    private String value;

    private Calculadora() {
    }

    private static void crearLaCalculadora() {
        calculadora = new Calculadora();
    }

    private static boolean noExisteUnaCalculadora() {
        return calculadora == null;
    }
    //aseguramos que solo se tenga una sola instancia

    public static Calculadora getCalculadora() {
        if (noExisteUnaCalculadora()) {
            crearLaCalculadora();
        }
        return calculadora;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double seno(double angulo) {
        return sin(angulo);
    }

    public double coseno(double angulo) {
        return cos(angulo);
    }

    public void setValue(String msg) {
        value = msg;
    }

    public String getValue() {
        return value;
    }
}
