/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedespenser.logic;

/**
 *
 * @author Damt
 */
public class Usuario {
    private int saldo;
    private String opcionElegida;
    private int devuelta;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getOpcionElegida() {
        return opcionElegida;
    }

    public void setOpcionElegida(String opcionElegida) {
        this.opcionElegida = opcionElegida;
    }

    public int getDevuelta() {
        return devuelta;
    }

    public void setDevuelta(int devuelta) {
        this.devuelta = devuelta;
    }
    
}
