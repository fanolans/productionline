/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class AudioPlayerDriver {


    public static void main(String[] args) {
        // Create an audio player
        AudioPlayer audioPlayer = new AudioPlayer("My Audio Player", "Superior audio");

        // Play the audio player
        audioPlayer.play();

        // Stop the audio player
        audioPlayer.stop();

        // Go to the previous media item
        audioPlayer.previous();

        // Go to the next media item
        audioPlayer.next();

        // Print the details of the audio player
        System.out.println(audioPlayer);
    }
}
    

