package aureligiuliagarathread;

import java.util.*;
/**
 * Classe che gestisce il torneo
 * @author utente
 */
public class Torneo {
    //coda con i concorrenti
    private Queue<Concorrente> coda;
    private Concorrente campione;
    //lista che contiene tutti i concorrenti che hanno partecipato
    private final List<Concorrente> partecipantiOriginali;

    /**
     * Metodo costruttore
     * @param partecipanti lista di partecipanti
     */
    public Torneo(List<Concorrente> partecipanti) {
        partecipantiOriginali = new ArrayList<>(partecipanti);
        //mette in ordine casuale i concorrenti
        Collections.shuffle(partecipanti);
        coda = new LinkedList<>(partecipanti);
        campione = null;
    }

    /**
     * Metodo per vedere i prossimi due concorrenti
     * @return restituisce i prossimi due concorrenti, se non ci sono altri due concorrenti restituisce null
     */
    public Concorrente[] prossimoRound() {
        if (coda.size() < 2) return null;
        //prende i prossimi due concorrenti
        Concorrente c1 = coda.poll();
        Concorrente c2 = coda.poll();
        return new Concorrente[]{c1, c2};
    }

    /**
     * Metodo che registra il vincitore e lo reinserisce nella coda
     * @param vincitore vincitore del round
     */
    public void registraVincitore(Concorrente vincitore) {
        coda.add(vincitore);
        // Se rimane un solo concorrente, viene inserito nella variabile campione
        if (coda.size() == 1) {
            campione = coda.peek();
        }
    }

    /**
     * Metodo che controlla se il torneo è finito
     * @return stato del torneo
     */
    public boolean torneoFinito() {
        return coda.size() == 1;
    }

    /**
     * Metodo get
     * @return campione del torneo
     */
    public Concorrente getCampione() {
        return campione;
    }

    /**
     * Metodo get
     * @return lista dei partecipanti al torneo
     */
    public List<Concorrente> getPartecipanti() {
        return partecipantiOriginali;
    }

    /**
     * Metodo get
     * @return coda dei concorrenti ancora in gara
     */
    public List<Concorrente> getCoda() {
        return new ArrayList<>(coda);
    }
}