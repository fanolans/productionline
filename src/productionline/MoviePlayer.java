/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */

//this class is a subclass of Product and uses the interface MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl {
    
    Screen screen;
    MonitorType monitortype;
    
    MoviePlayer(String name, Screen screen, MonitorType monitortype){  
      super(name);
      this.screen = screen;
      this.monitortype = monitortype;
    }

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
          "Screen: " + screen + "\n" +
          "Monitor Type: " + monitortype;
      return str;
    }
}
