/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmacedone;

/**
 *
 * @author marco
 */
public class AddEvent implements Event {
    
    private String Prodotto;

    public AddEvent(String Prodotto) {
        this.Prodotto = Prodotto;
    }

    public String getProdotto() {
        return Prodotto;
    }

    @Override
    public String toString() {
        return "AddEvent{" + "Prodotto=" + Prodotto + '}';
    }
    
    
    
}
