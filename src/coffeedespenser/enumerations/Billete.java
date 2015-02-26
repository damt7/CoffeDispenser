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
public enum Billete {
    MIL("2.000 $",1000),
    DOS_MIL("3.000 $",2000),
    CINCO_MIL("5.000 $",5000);
    
    private final String description;
    private final int value;

    private Billete(String name, int value) {
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
