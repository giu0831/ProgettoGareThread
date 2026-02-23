/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;

import java.util.*;
import javax.swing.ImageIcon;
/**
 *
 * @author utente
 */
public class GestioneTorneo {
    private static Torneo torneo;

    /**
     * Metodo che fa riiniziare il torneo
     */
    public static void nuovoTorneo() {
        //creazione dei personaggi
        ArrayList<Concorrente> partecipanti = new ArrayList<>();
        partecipanti.add(new Concorrente("Mizi", java.awt.Color.PINK, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_mizi.png"))));
        partecipanti.add(new Concorrente("Sua", java.awt.Color.GRAY, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_sua.png"))));
        partecipanti.add(new Concorrente("Till", java.awt.Color.GREEN, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_till.png"))));
        partecipanti.add(new Concorrente("Ivan", java.awt.Color.DARK_GRAY, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_ivan.png"))));
        partecipanti.add(new Concorrente("Luka", java.awt.Color.YELLOW, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_luka.png"))));
        partecipanti.add(new Concorrente("Hyuna", java.awt.Color.RED, new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_hyuna.png"))));
        //ricrea il torneo con tutti i personaggi
        torneo = new Torneo(partecipanti); 
   }

    /**
     * Metodo costruttore
     */
    public GestioneTorneo() {
    }

    /**
     * Metodo get
     * @return torneo
     */
    public static Torneo getTorneo() {
        return torneo;
    }
    
}
