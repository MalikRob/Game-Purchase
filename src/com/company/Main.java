package com.company;

import com.company.model.FPS;
import com.company.model.GameItem;
import com.company.model.GameSize;
import com.company.model.HnS;

public class Main {

    public static void main(String[] args) {

        GameItem itemA = new HnS(GameSize.M, 29.99, 2);
        GameItem itemB = new FPS(GameSize.L, 59.99, 1);

        var output = String.format("Your %s, %s game will cost %s.", itemA.getSize(), itemA.getType(), itemA.getPrice());
        System.out.println(output);

        var outputA = String.format("Your %s, %s game will cost %s.", itemB.getSize(), itemB.getType(), itemB.getPrice());
        System.out.println(outputA);

        /*GameItem sample = new GameItem("Hack 'n Slash", GameSize.M, 59.99,1);

        var output = String.format("Your %s, %s game will cost %s.", sample.getSize(), sample.getType(), sample.getPrice());
        System.out.println(output);*/
    }
}
