/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito.mensaaziendale;

/**
 * Thread consumatore che prende i piatti dal bancone.
 * @author Dardan Matias Berisha
 */
public class Dipendente extends Thread{
    
    private int piatto;
    private Bancone b;
    
    /**
     * Costruttore.
     * @param name nome del dipendente.
     * @param b bancone sul quale il dipendente prende i piatti.
     */
    public Dipendente(String name, Bancone b) {
        super(name);
        this.b = b;
    }

    @Override
    public void run() {
        
        piatto = b.prendiPiatto(); //dipendente prende il piatto
        
    }
    
    
    
}
