/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeedespenser.logic;

import coffeedespenser.enumerations.Billete;
import coffeedespenser.enumerations.Moneda;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Damt
 */
public class Contabilidad {
    Map<String,Integer> deposito_monedas = new HashMap<>();
    Map<String,Integer> deposito_billetes = new HashMap<>();

    public Contabilidad() {
        for (Moneda moneda : Moneda.values()) {
            deposito_monedas.put(moneda.name(), 20);
        }
        
        for (Billete billete : Billete.values()) {
            deposito_monedas.put(billete.name(),10);
        }
    }
      
}
