/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// step 14
package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CollectionSort {
    private static void print(List<Product> list) {
        for (Product product : list) {
            System.out.println(product + "\n");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Product> arraylist = new ArrayList<Product>();
        
        arraylist.add(new AudioPlayer("Audio 1", "Specification 1", ItemType.Audio));
        arraylist.add(new MoviePlayer("Movie 1",  new Screen("600x400", 40, 22), MonitorType.LED));
        
        arraylist.add(new AudioPlayer("Audio 2", "Specification 2", ItemType.Audio));
        arraylist.add(new MoviePlayer("Movie 2",  new Screen("600x400", 40, 22), MonitorType.LED));
        
        arraylist.add(new AudioPlayer("Audio 3", "Specification 3", ItemType.Audio));
        arraylist.add(new MoviePlayer("Movie 3",  new Screen("600x400", 40, 22), MonitorType.LED));
        
        arraylist.add(new AudioPlayer("Audio 4", "Specification 4", ItemType.Audio));
        arraylist.add(new MoviePlayer("Movie 4",  new Screen("600x400", 40, 22), MonitorType.LED));
        
        arraylist.add(new AudioPlayer("Audio 4", "Specification 5", ItemType.Audio));
        arraylist.add(new MoviePlayer("Movie 4",  new Screen("600x400", 40, 22), MonitorType.LED));
        
        Collections.sort(arraylist);
        
        print(arraylist);
    }
}
