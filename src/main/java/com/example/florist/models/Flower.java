package com.example.florist.models;

public class Flower {
    private final String type;
    private final Color color;
    private int freshness; // 1 to 10 scale
    private double stemLength;
    private double cost;

    public Flower(String type, Color color, int freshness, double stemLength, double cost) {
        this.type = type;
        this.color = color;
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }


    public Color getColor() {
        return color;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "type=" + type +
                ", color=" + color +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", cost=" + cost +
                '}';
    }
}
