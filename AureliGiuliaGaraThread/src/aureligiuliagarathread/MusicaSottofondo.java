/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aureligiuliagarathread;

import javax.sound.sampled.*;
import java.io.IOException;

/**
 * Classe che gestisce la musica di sottofondo
 * @author utente
 */
public class MusicaSottofondo {

    private Clip clip;

    /**
     * Metodo costruttore della classe MusicaSottofondo
     * @param percorsoRisorsa percorso della musica
     */
    public MusicaSottofondo(String percorsoRisorsa) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(
                getClass().getResource(percorsoRisorsa)
            );

            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // loop infinito
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        if (clip != null) clip.start();
    }

    public void stop() {
        if (clip != null) clip.stop();
    }
    
    /**
     * Imposta il volume della musica in decibel.
     * @param decibel numero decibel per abbassare il volume
     */
    public void setVolume(float decibel) {
        if (clip != null && clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(decibel);
        }
    }
}