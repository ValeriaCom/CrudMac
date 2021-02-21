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
public class AutomaCrud implements State {

    private State stato;
    private AutomabileCrud ui;

    public AutomaCrud(AutomabileCrud ui) {
        this.ui = ui;
        this.stato = new Ricerca();
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo arrivati nello stato " + stato + "\n");
    }

    private class Ricerca implements State {

        public Ricerca() {
            ui.entraStatoRicerca();
        }

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new Aggiungi();
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
                
               } else if (e instanceof NuovaEvent) {
                stato = new Modifica();
            
            } else if (e instanceof RicercaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("==========> Evento inatteso!!!");
                System.out.println("==========> L'evento " + e + " non è previsto nello stato " + this);
            }

        }
    }

    private class Aggiungi implements State {

        public Aggiungi() {
            ui.entraStatoAdd();
        }

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Visualizza();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
            } else {
                System.out.println("==========> Evento inatteso!!!");
                System.out.println("==========> L'evento " + e + " non è previsto nello stato " + this);
            }
        }
    }

    private class Rimuovi implements State {

        public Rimuovi() {
            ui.entraStatoRimuovi();
        }

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
            } else if (e instanceof AnnullaEvent) {
                stato = new Visualizza();
            } else if (e instanceof RimuoviEvent) {
                stato = new Visualizza();
            } else if (e instanceof RicercaEvent) {
                stato = new Visualizza();
            } else if (e instanceof ModificaEvent) {
                stato = new Modifica();
                 } else if (e instanceof NuovaEvent) {
                stato = new Visualizza();
            } else {
                System.out.println("==========> Evento inatteso!!!");
                System.out.println("==========> L'evento " + e + " non è previsto nello stato " + this);
            }
        }

    }

    private class Modifica implements State {

        public Modifica() {
            ui.entraStatoModifica();

        }

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
            } else if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
                
//                } else if (e instanceof ModificaEvent) {
//                stato = new Modifica();
            } else {
                System.out.println("==========> Evento inatteso!!!");
                System.out.println("==========> L'evento " + e + " non è previsto nello stato " + this);
            }

        }

    }

    private class Visualizza implements State {

        public Visualizza() {
            ui.entraStatoVisualizza();
        }

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new Ricerca();
            } else if (e instanceof RimuoviEvent) {
                stato = new Rimuovi();
            } else if (e instanceof SelezionaEvent) {
                stato = new Visualizza();
            } else if (e instanceof RicercaEvent) {
                stato = new Ricerca();
            } else if (e instanceof ConfermaEvent) {
                stato = new Ricerca();
            } else if (e instanceof NuovaEvent) {
                stato = new Modifica();
            } else {
                System.out.println("==========> Evento inatteso!!!");
                System.out.println("==========> L'evento " + e + " non è previsto nello stato " + this);
            }
        }

    }
}
