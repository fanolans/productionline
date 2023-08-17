/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class MoviePlayer extends Product implements MultimediaControl {

    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
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
            "Screen : %s\nMonitor Type : %s",
            screen, monitorType
        );
    }
        
    @Override
    public int compareTo(Product otherProduct) {
        return super.compareTo(otherProduct);
    }
}