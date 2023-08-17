/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AU;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
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
        return String.format(
            super.toString(),
            "Audio Spec : %s\nType : %s",
            audioSpecification, mediaType
        );
    }
        
    @Override
    public int compareTo(Product otherProduct) {
        return super.compareTo(otherProduct);
    }
}