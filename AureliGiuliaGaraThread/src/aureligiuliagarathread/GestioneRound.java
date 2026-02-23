/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;
import javax.swing.JProgressBar;
/**
 *
 * @author aureli.giulia
 */
public class GestioneRound {
    private static Round round;
    private static Concorrente[] concorrentiAttuali = new Concorrente[2];
    private static int nRound = 0;

    public static boolean nuovoRound(JProgressBar pb1, JProgressBar pb2){
        caricaConcorrenti();
        if(concorrentiAttuali == null)return false;
        round = new Round(concorrentiAttuali[0], concorrentiAttuali[1], pb1, pb2);
        nRound++;
        return true;
    }
    
    public static void avviaRound(){
        round.avvia();
    }
    
    public static Concorrente getVincitoreRound(){
        if(round.getVincitore() != null)return round.getVincitore();
        return null;
    }
    public static void caricaConcorrenti(){
        concorrentiAttuali = null;
        concorrentiAttuali = GestioneTorneo.getTorneo().prossimoRound();
    }
    
    public static void azzeraRound(){
        nRound = 0;
    }

    public static Round getRound() {
        return round;
    }

    public static Concorrente[] getConcorrentiAttuali() {
        return concorrentiAttuali;
    }

    public static int getNRound() {
        return nRound;
    }
    
    
}
