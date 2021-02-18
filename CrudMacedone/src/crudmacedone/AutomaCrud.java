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
public class AutomaCrud implements State{
    
    private State stato;

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo arrivati nello stato " + stato + "\n");
    }

    
    private class Ricerca {
        
    }
    
    
    
    
    
    
}
