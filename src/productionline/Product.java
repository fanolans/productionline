/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Clutz
 */
public class Product implements Item,Comparable<Product> {
    private static int currentProductionNumber = 1;

    private int serialNumber;
    private String manufacturer;
    private Date manufacturedOn;
    private String name;

    public Product(String name) {
        this.name = name;
        this.serialNumber = currentProductionNumber;
        currentProductionNumber++;
        this.manufacturedOn = new Date();
    }

    @Override
    public void setProductionNumber(int productionNumber) {
        this.serialNumber = productionNumber;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return String.format(
            "Manufacturer : %s\nSerial Number : %d\nDate : %s\nName : %s",
            manufacturer, serialNumber, manufacturedOn, name
        );
    }
    
    @Override
    public int compareTo(Product otherProduct) {
        return this.name.compareTo(otherProduct.name);
    }
    
    public static void printType(Collection<Product> products, Class<?> clazz) {
    for (Product product : products) {
        if (clazz.isInstance(product)) {
            System.out.println(product);
        }
    }
}
}
