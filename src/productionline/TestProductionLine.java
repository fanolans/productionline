/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;

import java.io.IOException;
import java.util.*;
/**
 *
 * @author Clutz
 */
public class TestProductionLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Create an EmployeeInfo object
        EmployeeInfo employeeInfo = new EmployeeInfo();

        // Create a list of products
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("My Audio Player", "Superior audio"));
        products.add(new Product("My Movie Player", new Screen("1920x1080", 60, 10), MonitorType.LED));

        // Write the product information to file
        ProcessFiles processFiles = new ProcessFiles();
        processFiles.WriteFile(products);

        // Write the employee information to file
        processFiles.WriteFile(employeeInfo);
    }
}

