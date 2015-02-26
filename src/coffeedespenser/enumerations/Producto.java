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

    CAFE("Cafe", 1000), 
    CAPPUCINO("Cappucino", 100), 
    MOKA("Cappucino", 100), 
    CAFE_LECHE("Cappucino", 100),
    EXPRESSO("Expresso",100);

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
