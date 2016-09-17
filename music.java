/*
 * This file holds the two static methods to play and stop music.
 * For the main, go to idk.java
 */

 // For music
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class music
{
    private Clip song = null;

    public void play(String song)
    {
        try {
            this.song = AudioSystem.getClip();
            this.song.open(AudioSystem.getAudioInputStream(new File(song)));
            this.song.start();
            this.song.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void stop()
    {
        try {
            song.stop();
        } catch (Exception e) {
            System.out.println("Guess this music ain't stoppin.");
        }
    }
}
