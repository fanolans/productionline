/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productionline;


import java.util.*;
/**
 *
 * @author Nolan
 */
public class Productionline {


    private Map<String, Integer> products;

    public Productionline() {
        products = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        products.put(productName, quantity);
    }

    public void displayProducts() {
        for (String productName : products.keySet()) {
            System.out.println(productName + ": " + products.get(productName));
        }
    }
public void getProductionStatistics() {
        int totalItems = 0;
        int uniqueProducts = 0;
        for (String productName : products.keySet()) {
            totalItems += products.get(productName);
            if (uniqueProducts < products.get(productName)) {
                uniqueProducts = products.get(productName);
            }
        }
        System.out.println("Total items produced: " + totalItems);
        System.out.println("Number of unique products created: " + uniqueProducts);
    }

    public static void main(String[] args) {
          Productionline productionline = new Productionline();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add product");
            System.out.println("2. Display products");
            System.out.println("3. Get production statistics");
            System.out.println("4. Quit");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Enter the product name:");
                String productName = scanner.next();

                System.out.println("Enter the quantity:");
                int quantity = scanner.nextInt();

                productionline.addProduct(productName, quantity);
            } else if (option == 2) {
                productionline.displayProducts();
            } else if (option == 3) {
                productionline.getProductionStatistics();
            } else if (option == 4) {
                break;
            }
        }
    }
    
}
