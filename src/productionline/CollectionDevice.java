/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// step 15 16
package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class CollectionDevice {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();

        devices.add(new Device("Audio 1", "Audio"));
        devices.add(new Device("Movie 1", "Movie"));

        Collections.sort(devices);

        for (Device device : devices) {
            System.out.println(device);
        }
    }
}

class Device implements Comparable<Device> {

    private String name;
    private String type;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Device other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
