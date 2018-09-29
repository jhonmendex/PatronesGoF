/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConFachada;

/**
 *
 * @author Jhon
 */
public class Facade {

    private ComprobarLiquidos liquidos;
    private ComprobarAsiento asiento;
    private ComprobarEspejos espejos;
    private Arrancar arrancar;

    // --------------------------------
    public Facade() {
        this.liquidos = new ComprobarLiquidos();
        this.asiento = new ComprobarAsiento();
        this.espejos = new ComprobarEspejos();
        this.arrancar = new Arrancar();
    }

    // --------------------------------
    public void arrancarCoche() {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arrancar.encenderContacto();
    }
}
