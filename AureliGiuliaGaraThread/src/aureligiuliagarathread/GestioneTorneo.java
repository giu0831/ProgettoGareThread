/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;

import java.util.*;

/**
 *
 * @author utente
 */
public class GestioneTorneo {
    private static Torneo torneo;

    public static void nuovoTorneo() {
        ArrayList<Concorrente> partecipanti = new ArrayList<>();
        partecipanti.add(new Concorrente("Mizi", java.awt.Color.PINK));
        partecipanti.add(new Concorrente("Sua", java.awt.Color.GRAY));
        partecipanti.add(new Concorrente("Till", java.awt.Color.GREEN));
        partecipanti.add(new Concorrente("Ivan", java.awt.Color.DARK_GRAY));
        partecipanti.add(new Concorrente("Luka", java.awt.Color.YELLOW));
        partecipanti.add(new Concorrente("Hyuna", java.awt.Color.RED));
        torneo = new Torneo(partecipanti); 
   }

    public GestioneTorneo() {
    }

    
    public static Torneo getTorneo() {
        return torneo;
    }
    
}
