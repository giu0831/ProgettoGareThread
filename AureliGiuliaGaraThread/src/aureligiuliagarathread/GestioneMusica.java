/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;
import java.util.*;
/**
 * Classe che gestisce la musica riprodotta durante i round
 * @author utente
 */
public class GestioneMusica {
    private static List<String> listaCanzoni;
    private static Queue<String> codaCanzoni;
    
    static{
        listaCanzoni = new ArrayList<>();
        listaCanzoni.add("/suoni/My_Clematis.wav");
        listaCanzoni.add("/suoni/Unknown.wav");
        listaCanzoni.add("/suoni/Blink_Gone.wav");
        listaCanzoni.add("/suoni/Cure.wav");
        listaCanzoni.add("/suoni/Ruler_Of_My_Heart.wav");
    }
    
    /**
     * Metodo che cambia l'ordine delle canzoni
     */
    public static void mischiaCanzoni(){
        Collections.shuffle(listaCanzoni);
        codaCanzoni = new LinkedList<>(listaCanzoni);
    }
    
    public static String cambiaCanzone(){
        return codaCanzoni.poll();
    }
}
