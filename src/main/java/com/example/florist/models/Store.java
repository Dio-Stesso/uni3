package com.example.florist.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final List<Flower> flowerShopInventory = new ArrayList<>();
    public static final List<Accessory> accessoryShopInventory = new ArrayList<>();

    static {
        initializeAccessoryShopInventory();
        initializeFlowerShopInventory();
    }

    private static void initializeFlowerShopInventory() {
        flowerShopInventory.add(new Flower("Rose", Color.RED, 7, 15.0, 10.0));
        flowerShopInventory.add(new Flower("Tulip", Color.YELLOW, 5, 12.0, 8.0));
        flowerShopInventory.add(new Flower("Peony", Color.PINK, 9, 10.0, 12.0));
        flowerShopInventory.add(new Flower("Lily", Color.WHITE, 8, 14.0, 9.0));
        flowerShopInventory.add(new Flower("Orchid", Color.BLUE, 6, 18.0, 11.0));
        flowerShopInventory.add(new Flower("Lavender", Color.PURPLE, 10, 20.0, 15.0));
        flowerShopInventory.add(new Flower("Marigold", Color.ORANGE, 4, 9.0, 7.0));
        flowerShopInventory.add(new Flower("Chrysanthemum", Color.GREEN, 8, 12.0, 10.0));
        flowerShopInventory.add(new Flower("Dahlia", Color.BLACK, 3, 13.0, 20.0));
        flowerShopInventory.add(new Flower("Alstroemeria", Color.BROWN, 7, 11.0, 9.0));
    }

    private static void initializeAccessoryShopInventory() {
        accessoryShopInventory.add(new Accessory("Ribbon", 2.0));
        accessoryShopInventory.add(new Accessory("Greeting Card", 1.5));
        accessoryShopInventory.add(new Accessory("Wrapping Paper", 3.0));
        accessoryShopInventory.add(new Accessory("Vase", 5.0));
        accessoryShopInventory.add(new Accessory("Decorative Stones", 4.0));
        accessoryShopInventory.add(new Accessory("Glitter", 1.0));
    }
}
