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
    private static List<String> listaCanzoni; //lista di canzoni possibili
    private static Queue<String> codaCanzoni; //ordine delle canzoni
    
    static{
        //vengono aggiunte i percorsi delle canzoni
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
        //le canzoni vengono mischiate
        Collections.shuffle(listaCanzoni);
        //viene creata una coda con la lista appenamischiata
        codaCanzoni = new LinkedList<>(listaCanzoni);
    }
    
    /**
     * Metodo per passare alla canzone successiva
     * @return canzone successiva
     */
    public static String cambiaCanzone(){
        return codaCanzoni.poll();
    }
}
