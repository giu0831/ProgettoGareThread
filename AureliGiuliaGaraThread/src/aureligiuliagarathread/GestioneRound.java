/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;
import javax.swing.JProgressBar;
/**
 * Classe che gestisce i round
 * @author aureli.giulia
 */
public class GestioneRound {
    private static Round round; // round corrente
    private static Concorrente[] concorrentiAttuali = new Concorrente[2]; //concorrenti attuali
    private static int nRound = 0; //numero di round attuale

    /**
     * Metodo per passare al round successivo
     * @param pb1 progress bar da assegnare al primo concorrente
     * @param pb2 progress bar da assegnare al secondo concorrente
     * @return true se e' stato creato un nuovo round, false se non e' stato creato un nuovo round
     */
    public static boolean nuovoRound(JProgressBar pb1, JProgressBar pb2){
        //vengono presi 2 concorrenti
        caricaConcorrenti();
        //controllo che vede se sono stati caricati 2 concorrenti
        if(concorrentiAttuali == null)return false;
        //creazione round
        round = new Round(concorrentiAttuali[0], concorrentiAttuali[1], pb1, pb2);
        //incremento numero round
        nRound++;
        return true;
    }
    
    /**
     * Metodo che avvia il round
     */
    public static void avviaRound(){
        round.avvia();
    }
    
    /**
     * Metodo get
     * @return vincitore del round
     */
    public static Concorrente getVincitoreRound(){
        //controllo che vede se il round e' finito
        if(round.isFinito())return round.getVincitore();
        return null;
    }
    
    /**
     * Metodo che prende due concorrenti
     */
    public static void caricaConcorrenti(){
        concorrentiAttuali = null;
        concorrentiAttuali = GestioneTorneo.getTorneo().prossimoRound();
    }
    
    /**
     * Metodo che fa ripartire da capo i round
     */
    public static void azzeraRound(){
        nRound = 0;
    }

    /**
     * Metodo get
     * @return round attuale
     */
    public static Round getRound() {
        return round;
    }

    /**
     * Metodo get
     * @return concorrenti attuali
     */
    public static Concorrente[] getConcorrentiAttuali() {
        return concorrentiAttuali;
    }

    /**
     * Metodo get
     * @return numero round
     */
    public static int getNRound() {
        return nRound;
    }
    
    
}
