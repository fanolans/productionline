/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Nolan
 */
public class AudioPlayer extends Product implements MultimediaControl {

    protected String audioSpecification;
    protected ItemType mediaType;

    //Constructor that sets name and specification, defaults the mediaType.
    public AudioPlayer(String name, String specification, ItemType itemtype) {
      super(name);
      this.audioSpecification = specification;
      this.mediaType = ItemType.Audio;
    }

    //Override Methods
    @Override
    public void play() {
      System.out.println("Playing");
    }

    @Override
    public void stop() {
      System.out.println("Stopped");
    }

    @Override
    public void previous() {
      System.out.println("Previous");
    }

    @Override
    public void next() {
      System.out.println("Next");
    }

    @Override
    public String toString() {
      String str = super.toString() + "\n" +
          "Audio Specification: " + audioSpecification + "\n" +
          "Type: " + mediaType;
      return str;
    }
}