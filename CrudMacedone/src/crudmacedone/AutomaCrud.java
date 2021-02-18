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

    
    private class RicercaEvent implements State{

        public RicercaEvent() {
        }

        

        @Override
        public void next(Event e) {  
            
        }
        
    }
    
    private class AddEvent implements State{

        public AddEvent() {
        }

        @Override
        public void next(Event e) {
        }
    }
    
    private class RimuoviEvent implements State{

        public RimuoviEvent() {
        }

        @Override
        public void next(Event e) {
        }
    
    }
    
     private class ModificaEvent implements State{

        public ModificaEvent() {
        }

        @Override
        public void next(Event e) {
            
        }
     
     }
    
     private class VisualizzaEvent implements State{

        public VisualizzaEvent() {
        }

        @Override
        public void next(Event e) {
        }
         
     }
     
      private class SelezionaEvent implements State{

        public SelezionaEvent() {
        }

        @Override
        public void next(Event e) {
        }
      
      }
}
