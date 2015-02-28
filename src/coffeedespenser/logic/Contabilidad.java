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
    private Map<String,Integer> deposito_monedas = new HashMap<>();
    private Map<String,Integer> deposito_billetes = new HashMap<>();

    public Contabilidad() {
        for (Moneda moneda : Moneda.values()) {
            deposito_monedas.put(moneda.name(), 20);
        }
        
        for (Billete billete : Billete.values()) {
            deposito_monedas.put(billete.name(),10);
        }
    }
    
    public int calcularDevuelta(int valueOption,int valueSaldo){                  
        return valueSaldo-valueOption;
    }
    
    public void addCurrency(Moneda moneda){
        deposito_monedas.put(moneda.name(), moneda.getValue());
    }
    
    public void addCash(Billete billete){
        deposito_billetes.put(billete.name(), billete.getValue());
    }

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Map<String, Integer> getDeposito_monedas() {
        return deposito_monedas;
    }
    
    public Map<String, Integer> getDeposito_billetes() {
        return deposito_billetes;
    }
//</editor-fold>
}
