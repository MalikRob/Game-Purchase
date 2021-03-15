package com.company.model;

public class GameItem {

    public static final String HNS = "Hack 'n Slash";
    public static final String FPS = "First Person Shooter";
    public static final String PZ = "Puzzle";
    public static final String STRAT = "Strategy";

    private String type;
    private GameSize size;
    private double price;
    private int quantity;

    public GameItem(String type, GameSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GameSize getSize() {
        return size;
    }

    public void setSize(GameSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
