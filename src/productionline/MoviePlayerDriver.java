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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Screen testformovieplay = new Screen("600x400",40,22);
        MoviePlayer testmovieplayer = new MoviePlayer("myMovieplayer",testformovieplay,MonitorType.LCD);
            System.out.println(testmovieplayer.toString());
            testmovieplayer.play();
            testmovieplayer.previous();
            testmovieplayer.next();
            testmovieplayer.stop();
    }
    
}
