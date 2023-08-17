/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Clutz
 */
public class DeviceCollection {

    public static void main(String[] args) {
        // Create an ArrayList to store the devices
        ArrayList<Product> products = new ArrayList<>();

        // Add a few devices to the ArrayList
        products.add(new AudioPlayer("My Audio Player", "Superior audio"));
        products.add(new MoviePlayer("My Movie Player", new Screen("1920x1080", 60, 10), MonitorType.LED));
        products.add(new Product("My Other Device"));

        // Sort the devices by name
        Collections.sort(products);

        // Print all of the AudioPlayer objects in the collection
        Product.printType(products, AudioPlayer.class);
    }
}
