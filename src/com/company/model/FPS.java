package com.company.model;

/**
 * Sub class of GameItem that, by being called during construction of a GameItem object, gives a predefined [type].
 *
 * @author malik
 * @version 1.0
 * @since 03/17/2021
 */
public class FPS extends GameItem {
    //Constructor that replaces the typical [type] with GameItem calling FPS.
    public FPS(GameSize size, double price, int quantity) {
        super(GameItem.FPS, size, price, quantity);
    }
}
