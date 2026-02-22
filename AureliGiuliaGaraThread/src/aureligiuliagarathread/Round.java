/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * Classe round che gestisce gli scontri
 * @author utente
 */
public class Round {
    private Concorrente c1;
    private Concorrente c2;
    private ProgressThread t1;
    private ProgressThread t2;
    private Concorrente vincitore;
    private boolean finito;

    /**
     * Metodo costruttore della classe Round
     * @param c1 primo concorrente
     * @param c2 secondo concorrente
     * @param barra1 barra assegnata al primo concorrente
     * @param barra2 barra assegnata al secondo concorrente
     */
    public Round(Concorrente c1, Concorrente c2, JProgressBar barra1, JProgressBar barra2) {
        this.c1 = c1;
        this.c2 = c2;
        t1 = new ProgressThread(barra1);
        t2 = new ProgressThread(barra2);
        finito = false;
    }
    
    /**
     * Metodo che avvia il round
     */
    public void avvia(){
        //avvio thread dei concorrenti
        t1.start();
        t2.start();
        //creazione nuovo thread che controllera' chi finisce prima
        Thread t = new Thread(() -> {
            while (vincitore == null) {
                //controllo per vedere se il primo thread ha finito
                if (t1.isFinito() && vincitore == null) {
                    vincitore = c1;
                    t2.ferma();
                }
                //controllo per vedere se il secondo thread ha finito
                if (t2.isFinito() && vincitore == null) {
                    vincitore = c2;
                    t1.ferma();
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            finito = true;
        });
        //avvio thread
        t.start();
    }
    
    /**
     * Metodo get
     * @return se il round e' finito, restituisce il vincitore del round
     */
    public Concorrente getVincitore(){
        if(finito)return vincitore;
        else return null;
    }

    public Concorrente getC1() {
        return c1;
    }

    public Concorrente getC2() {
        return c2;
    }

    public ProgressThread getT1() {
        return t1;
    }

    public ProgressThread getT2() {
        return t2;
    }

    public boolean isFinito() {
        return finito;
    }
    
    /**
     * Metodo che mette in pausa il round
     */
    public void pausaRound(){
        t1.pausa();
        t2.pausa();
    }
    
    /**
     * Metodo che riprende il round
     */
    public void riprendiRound(){
        t1.riprendi();
        t2.riprendi();
    }
}
