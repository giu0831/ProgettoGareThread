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
    private static ArrayList<Concorrente> classifica;
    /**
     * Metodo che fa riiniziare il torneo
     */
    public static void nuovoTorneo() {
        //creazione dei personaggi
        ArrayList<Concorrente> partecipanti = new ArrayList<>();
        partecipanti.add(new Concorrente("Mizi", java.awt.Color.decode("#f04ae2"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_mizi.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_mizi.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_mizi.png"))));
        partecipanti.add(new Concorrente("Sua", java.awt.Color.decode("#e8adff"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_sua.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_sua.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_sua.png"))));
        partecipanti.add(new Concorrente("Till", java.awt.Color.decode("#4ad7f0"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_till.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_till.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_till.png"))));
        partecipanti.add(new Concorrente("Ivan", java.awt.Color.decode("#2d2e2e"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_ivan.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_ivan.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_ivan.png"))));
        partecipanti.add(new Concorrente("Luka", java.awt.Color.decode("#e6d21e"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_luka.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_luka.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_luka.png"))));
        partecipanti.add(new Concorrente("Hyuna", java.awt.Color.decode("#f5540a"), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_hyuna.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_testa_hyuna.png")), new ImageIcon(GestioneTorneo.class.getResource("/immagini/icona_classifica_hyuna.png"))));
        //crea il torneo con tutti i personaggi
        torneo = new Torneo(partecipanti); 
        classifica = new ArrayList<>(torneo.getPartecipanti());
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

    /**
     * Metodo get
     * @return lista per aggiornare la classifica
     */
    public static ArrayList<Concorrente> getClassifica() {
        return classifica;
    }
    
    /**
     * Metodo per aggiungere il vincitore di un round 
     * @param vincitore vincitore del round
     */
    public static void aggiungiRisultato(Concorrente vincitore){
        classifica.add(vincitore);
    }
}
