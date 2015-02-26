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
public enum Moneda {
    CIEN("100 $",100),
    DOCIENTOS("200 $",200),
    QUINIENTOS("500 $",500);
    
    private final String description;
    private final int value;

    private Moneda(String name, int value) {
        this.description = name;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
        
}
