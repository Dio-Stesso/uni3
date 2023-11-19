package com.example.florist;

import com.example.florist.models.*;

import java.util.List;
import java.util.Scanner;

public class FloristApplication {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        boolean running = true;

        while (running) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a flower to the bouquet");
            System.out.println("2. Add an accessory to the bouquet");
            System.out.println("3. Show the bouquet");
            System.out.println("4. Sort flowers by freshness");
            System.out.println("5. Find flowers by stem length");
            System.out.println("6. Calculate total cost of the bouquet");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addFlowerToBouquet(bouquet);
                    break;
                case 2:
                    addAccessoryToBouquet(bouquet);
                    break;
                case 3:
                    System.out.println(bouquet);
                    break;
                case 4:
                    bouquet.sortFlowersByFreshness();
                    System.out.println("Bouquet sorted by freshness.");
                    break;
                case 5:
                    findFlowersByStemLength(bouquet);
                    break;
                case 6:
                    System.out.println("Total cost: " + bouquet.calculateTotalCost());
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addFlowerToBouquet(Bouquet bouquet) {
        System.out.println("Available Flowers:");
        for (int i = 0; i < Store.flowerShopInventory.size(); i++) {
            Flower flower = Store.flowerShopInventory.get(i);
            System.out.println((i + 1) + ". " + flower);
        }
        System.out.println("Choose a flower number to add to the bouquet:");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= Store.flowerShopInventory.size()) {
            Flower selectedFlower = Store.flowerShopInventory.get(choice - 1);
            bouquet.addFlower(selectedFlower);
            System.out.println("Flower added to bouquet: " + selectedFlower);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }


    private static void addAccessoryToBouquet(Bouquet bouquet) {
        System.out.println("Available Accessories:");
        for (int i = 0; i < Store.accessoryShopInventory.size(); i++) {
            Accessory accessory = Store.accessoryShopInventory.get(i);
            System.out.println((i + 1) + ". " + accessory);
        }
        System.out.println("Choose an accessory number to add to the bouquet:");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= Store.accessoryShopInventory.size()) {
            Accessory selectedAccessory = Store.accessoryShopInventory.get(choice - 1);
            bouquet.addAccessory(selectedAccessory);
            System.out.println("Accessory added to bouquet: " + selectedAccessory);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }


    private static void findFlowersByStemLength(Bouquet bouquet) {
        System.out.println("Enter minimum stem length:");
        double minLen = scanner.nextDouble();
        System.out.println("Enter maximum stem length:");
        double maxLen = scanner.nextDouble();

        List<Flower> matchingFlowers = bouquet.findFlowerByStemLength(minLen, maxLen);
        if (matchingFlowers.isEmpty()) {
            System.out.println("No flowers found with given stem length range.");
        } else {
            System.out.println("Flowers with stem length between " + minLen + " and " + maxLen + ":");
            for (Flower flower : matchingFlowers) {
                System.out.println(flower);
            }
        }
    }
}
