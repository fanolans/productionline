/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class Driver {

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

        // Create a movie player
        Screen screen = new Screen("1920x1080", 60, 10);
        MoviePlayer moviePlayer = new MoviePlayer("My Movie Player", screen, MonitorType.LED);

        // Play the movie player
        moviePlayer.play();

        // Stop the movie player
        moviePlayer.stop();

        // Go to the previous media item
        moviePlayer.previous();

        // Go to the next media item
        moviePlayer.next();

        // Print the details of the movie player
        System.out.println(moviePlayer);
    }
}
