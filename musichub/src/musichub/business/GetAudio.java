import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

class GetAudio{
    public static void main(String [] args){

        String audioName = "Foret.wav";
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Audio/" + audioName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(20000);
        } catch (Exception ex){
            System.out.println("Error with playing sound.");
        }
    }
}