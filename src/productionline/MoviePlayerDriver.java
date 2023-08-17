/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class MoviePlayerDriver {

    public static void main(String[] args) {
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
