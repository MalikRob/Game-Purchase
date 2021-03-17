package com.company;

import com.company.model.FPS;
import com.company.model.GameItem;
import com.company.model.GameSize;
import com.company.model.HnS;

import java.text.NumberFormat;

/**
 * @author malik
 *
 * This program will display the details of an array of objects from the GameItem class. While an enum and two
 * sub-classes will help with streamlining the construction of said objects.
 *
 * The array of objects will be displayed by a for-each loop that calls a method that will display the qualities of the
 * objects in an ordely fashion, one line per object.
 *
 * @version 1.0
 * @since 03/17/2021
 */
public class Main {

    /**
     *
     * @param args
     *
     * This method holds the called array of GameItem; each constructed with different values in each category.
     * A for-each loop will iterate through the array and call a method for each object within that will display the
     * objects information in an orderly fashion.
     * No user input required; all automatic.
     */
    public static void main(String[] args) {

        //Array of GameItem to hold the two objects.
        GameItem[] items = {
                new HnS(
                        GameSize.M,
                        29.99,
                        2),
                new FPS(
                        GameSize.L,
                        59.99,
                        1)
        };

        //For-each loop that calls the method for displaying the information of each object.
        for (GameItem item: items) {
            displayGameItemDetail(item);
        }
    }

    /**
     *
     * @param item Requires an instance of GameItem for the method calls within to work.
     *
     * This method gets the total price of the purchase by multiplying the individual price and quantity, ensures the
     * result is in the proper format by calling NumberFormat.getCurrencyInstance, and formats the string so that all
     * information can be displayed in the console in an orderly fashion.
     */
    private static void displayGameItemDetail (GameItem item) {

        //Getting a proper total of expense based on base price times quantity.
        var totalPrice = item.getPrice() * item.getQuantity();

        //Declares and initializes a formatter for use in the String.format.
        var formatter = NumberFormat.getCurrencyInstance();

        //Uses %s to place the information called via methods at the right parts in the string.
        var output = String.format("Your %s, %s purchase will cost %s. Quantity: %s",
                item.getSize(),
                item.getType(),
                //Gives total price the right format for currency.
                formatter.format(totalPrice),
                item.getQuantity());
        System.out.println(output);
    }
}
