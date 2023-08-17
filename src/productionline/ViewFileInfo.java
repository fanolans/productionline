/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 *
 * @author Clutz
 */
public class ViewFileInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:\\LineTests\\TestResults.txt");
        try (BufferedReader reader = Files.newBufferedReader(p, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + p);
        }
    }
}