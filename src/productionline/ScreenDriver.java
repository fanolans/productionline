/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;

/**
 *
 * @author Clutz
 */
public class ScreenDriver {

    public static void main(String[] args) {
        // Create a screen
        Screen screen = new Screen("600x400", 40, 22);

        // Print the details of the screen
        System.out.println(screen);
    }
}