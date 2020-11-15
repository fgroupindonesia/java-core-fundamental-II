/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi03;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author ASUS
 */
public class PraktekAudio  {
    
    public static void main(String[] args) throws Exception {
        PraktekAudio coba = new PraktekAudio();
        coba.putar();
    }
    
    boolean playCompleted = false;
    
    public void putar() throws Exception {
        File audioFile = new File("D:/w.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioStream);
        audioClip.start();
        Thread.sleep(3000);
        audioClip.close();
        
    }
    
   
    
}
