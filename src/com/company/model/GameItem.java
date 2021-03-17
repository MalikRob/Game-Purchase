package com.company.model;

/**
 * Contains, sets, and gets all basic GameItem information.
 * And sets up static, final string keywords for shorthands of standard titles to save time.
 *
 * @author malik
 * @version 1.0
 * @since 03/03/2021
 */
public class GameItem {

    //Title shorthands.
    public static final String HNS = "Hack 'n Slash";
    public static final String FPS = "First Person Shooter";
    public static final String PZ = "Puzzle";
    public static final String STRAT = "Strategy";

    //All needed private variables
    private String type;
    //Private variable of GameSize(sub-class)
    private GameSize size;
    private double price;
    private int quantity;

    /**
     * This method is the constructor, can be called to fill in the data fields of an instance of GameItem.
     * @param type For the type/genre of the game.
     * @param size For the scope of the game.
     * @param price For the price of purchasing one.
     * @param quantity For the number of games being bought.
     */
    public GameItem(String type, GameSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * This method returns the [type] of a GameItem object.
     * @return Outputs the value at the method call.
     */
    public String getType() {
        return type;
    }

    /**
     * This method sets the [type] of a GameItem object.
     * @param type This should be the type/genre of game as a string.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the [size] of a GameItem object.
     * @return Outputs the value at the method call.
     */
    public GameSize getSize() {
        return size;
    }

    /**
     * This method sets the [size] of a GameItem object.
     * @param size This should be the size of the game as a string.
     */
    public void setSize(GameSize size) {
        this.size = size;
    }

    /**
     * This method returns the [price] of a GameItem object.
     * @return Outputs the value at the method call.
     */
    public double getPrice() {
        return price;
    }

    /**
     * This method sets the [price] of a GameItem object.
     * @param price This is the price of the product entered as a double.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method returns the [quantity] of a GameItem object.
     * @return Outputs the value at the method call.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This sets the [quantity] of a GameItem object.
     * @param quantity This should hold how many copies of the product is purchased.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
