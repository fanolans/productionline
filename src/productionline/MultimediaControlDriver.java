/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// step 13
package productionline;

/**
 *
 * @author Administrator
 */
public class MultimediaControlDriver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Audio Name", "Specification", ItemType.Audio);
        audioPlayer.play();
        audioPlayer.next();
        audioPlayer.stop();
        audioPlayer.previous();
    
        MoviePlayer moviePlayer = new MoviePlayer("Movie Name", new Screen("600x400", 40, 22), MonitorType.LED);
        moviePlayer.play();
        moviePlayer.next();
        moviePlayer.stop();
        moviePlayer.previous();
    }
    
}
