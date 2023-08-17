/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Nolan
 */
public class AudioPlayerDriver {
    public static void main(String[] args) {
    AudioPlayer player = new AudioPlayer("myAudioPlayer", "mySpec");
    System.out.println("Created an audio player and calling methods...");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }
}
