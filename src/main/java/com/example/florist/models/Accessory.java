package com.example.florist.models;

public class Accessory {
    private final String type;
    private double cost;

    public Accessory(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}

