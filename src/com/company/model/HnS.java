package com.company.model;

/**
 * Sub class of GameItem that, by being called during construction of a GameItem object, gives a predefined [type].
 *
 * @author malik
 * @version 1.0
 * @since 03/17/2021
 */
public class HnS extends GameItem {
    //Constructor that replaces the typical [type] with GameItem calling HNS.
    public HnS(GameSize size, double price, int quantity) {
        super(GameItem.HNS, size, price, quantity);
    }
}
