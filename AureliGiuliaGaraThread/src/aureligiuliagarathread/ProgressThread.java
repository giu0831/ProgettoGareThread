/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;
import java.awt.Color;
import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
/**
 * Classe che gestisce l'avanzamento della progress bar
 * @author utente
 */
public class ProgressThread extends Thread{
    private JProgressBar barra;
    private volatile boolean pausa;
    private volatile boolean finito;
    private volatile boolean stop;
    private int ritardo;
    /**
     * Metodo costruttore della classe ProgressThread
     * @param barra progress bar utilizzata dal thread
     */
    public ProgressThread(JProgressBar barra){
        if(barra == null) throw new IllegalArgumentException("La progress bar passata era null");
        Random r = new Random();
        this.barra = barra;
        pausa = false;
        finito = false;
        stop = false;
        ritardo = r.nextInt(10, 101);
    }

    /**
     * Metodo che avvia i thread
     */
    @Override
    public void run(){
        //ciclo per aggiungere 1 fino a che la barra non raggiunge 100
        for(int i = 0; i < 100; i++){
            //controllo per vedere se il thread va fermato completamente
            if(stop)return;
            //variabile final perche' altrimenti non puo' essere usata da invokelater
            final int valore = i + 1;
            //cambia il valore della progress bar
            SwingUtilities.invokeLater(() -> barra.setValue(valore));
            //ciclo che controlla se il thread deve andare in pausa
            while(pausa){
                try{
                    //tempo di riposo tra un controllo e l'altro per vedere quando il thread deve tornare a funzionare
                    Thread.sleep(10);
                }catch(InterruptedException ie){
                    System.out.println("Thread interrotto");
                }
            }
            try{
                //ritardo nel cambio di valore della barra, piu' e' alto, piu' sara' lento a finire
                Thread.sleep(ritardo);
            }catch(InterruptedException ie){
                System.out.println("Thread interrotto");
            }
        }
        finito = true;
    }
    
    /**
     * Metodo get
     * @return stato del thread, se e' finito o no
     */
    public boolean isFinito(){
        return finito;
    }
    
    /**
     * Metodo che mette in pausa il thread
     */
    public void pausa(){
        pausa = true;
    }
    
    /**
     * Metodo che riavvia il thread
     */
    public void riprendi(){
        pausa = false;
    }
    
    /**
     * Metodo che ferma completamente il thread
     */
    public void ferma(){
        stop = true;
    }
    
    /**
     * Metodo per cambiare il foreground della barra
     * @param c nuovo foreground della barra
     */
    public void cambiaColore(Color c){
        SwingUtilities.invokeLater(() -> barra.setForeground(c));
    }
}
