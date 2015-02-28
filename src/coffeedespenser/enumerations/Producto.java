/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedespenser.enumerations;

/**
 *
 * @author Damt
 */
public enum Producto {

    CAFE("Cafe", 1200), 
    CAPPUCINO("Cappucino", 2500), 
    MOKA("Moka", 2000), 
    CAFE_LECHE("Cappucino", 1800),
    EXPRESSO("Expresso",2100),
    AMERICANO("Americano",2400);

    private final String name;
    private final int value;

    private Producto(String name, int value) {  
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
