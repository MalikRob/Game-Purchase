package com.company;

import com.company.model.FPS;
import com.company.model.GameItem;
import com.company.model.GameSize;
import com.company.model.HnS;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        /*GameItem itemA = new HnS(GameSize.M, 29.99, 2);
        displayGameItemDetail(itemA);

        GameItem itemB = new FPS(GameSize.L, 59.99, 1);
        displayGameItemDetail(itemB);*/

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

        for (GameItem item: items) {
            displayGameItemDetail(item);
        }
    }

    private static void displayGameItemDetail (GameItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s purchase will cost %s. Quantity: %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice),
                item.getQuantity());
        System.out.println(output);
    }
}
