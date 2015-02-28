/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedespenser.logic;

import coffeedespenser.enumerations.Producto;

/**
 *
 * @author Damt
 */
public class Usuario {
    private static int saldo=0;
    private static Producto opcionElegida;

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        Usuario.saldo = saldo;
    }

    public static Producto getOpcionElegida() {
        return opcionElegida;
    }

    public static void setOpcionElegida(Producto opcionElegida) {
        Usuario.opcionElegida = opcionElegida;
    }        
}
