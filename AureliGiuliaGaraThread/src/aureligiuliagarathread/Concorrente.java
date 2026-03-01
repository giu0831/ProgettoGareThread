/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Classe concorrente che tiene le informazioni di un concorrente come il nome e il colore della progress bar utilizzata da esso
 * @author utente
 */
public class Concorrente {
    private String nome;
    private Color colore;
    private ImageIcon icona;
    private ImageIcon iconaTesta;
    private ImageIcon iconaClassifica;

    /**
     * Metodo costruttore della classe Concorrente
     * @param nome nome del concorrente
     * @param colore colore della progress bar utilizzata da lui
     * @param icona immagine del personaggio
     * @param iconaTesta immagine della testa
     */
    public Concorrente(String nome, Color colore, ImageIcon icona, ImageIcon iconaTesta, ImageIcon iconaClassifica) {
        this.nome = nome;
        this.colore = colore;
        this.icona = icona;
        this.iconaTesta = iconaTesta;
        this.iconaClassifica = iconaClassifica;
    }

    /**
     * Metodo get
     * @return nome del concorrente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get
     * @return colore della progress bar utilizzata da lui
     */
    public Color getColore() {
        return colore;
    }

    /**
     * Metodo get
     * @return immagine del personaggio
     */
    public ImageIcon getIcona() {
        return icona;
    }

    /**
     * Metodo get
     * @return immagine della testa
     */
    public ImageIcon getIconaTesta() {
        return iconaTesta;
    }

    /**
     * Metodo get
     * @return immagine per la classifica
     */
    public ImageIcon getIconaClassifica() {
        return iconaClassifica;
    }

    
    
    @Override
    public String toString() {
        return nome;
    }
  
    
    
}
