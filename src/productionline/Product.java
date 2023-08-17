/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productionline;

import java.util.Date;

/**
 *
 * @author Nolan
 */
public class Product implements Item, Comparable<Item> {

    protected int serialNumber;
    protected String manufacturer;
    protected Date manufacturedOn;
    protected String name;

    private static int currentProductionNumber = 1;

    public Product(String name) {
      setName(name);
      setProductionNumber(currentProductionNumber++);
      manufacturer = MANUFACTURER;
      manufacturedOn = new Date();
    }

    @Override
    public void setProductionNumber(int productionNumber) {
      serialNumber = productionNumber;
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

    //To String
    public String toString() {
      String output = "Manufacturer: " + manufacturer + "\n" +
          "Serial Number: " + serialNumber + "\n" +
          "Date: " + manufacturedOn + "\n" +
          "Name: " + name + "\n";
      return output;
    }

    @Override
    public int compareTo(Item o) {
      return name.compareTo(o.getName());
    }
}