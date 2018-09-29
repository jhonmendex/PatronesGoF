package Creacion.Singleton;

/**
 *
 * @author Jhon
 */
public class Prueba {

    public void probar() {
        Calculadora c1 = Calculadora.calculadora;
        Calculadora c2 = Calculadora.calculadora;
        Calculadora C3 = Calculadora.calculadora;
        
        System.out.println(c1.sumar(1, 1) + " " + c2.restar(2, 4));

        c1.setValue("hola");
        
        System.out.println(c2.getValue());

    }

    public static void main(String[] args) {
        new Prueba().probar();
    }
}
