package com.example.florist.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bouquet {
    private final List<Flower> flowers;
    private final List<Accessory> accessories;

    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Flower flower : flowers) {
            total += flower.getCost();
        }
        for (Accessory accessory : accessories) {
            total += accessory.getCost();
        }
        return total;
    }

    public void sortFlowersByFreshness() {
        flowers.sort(Comparator.comparingInt(Flower::getFreshness));
    }

    public List<Flower> findFlowerByStemLength(double minLen, double maxLen) {
        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() >= minLen && flower.getStemLength() <= maxLen) {
                matchingFlowers.add(flower);
            }
        }
        return matchingFlowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", accessories=" + accessories +
                '}';
    }
}
