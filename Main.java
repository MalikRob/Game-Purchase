package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameItem sample = new GameItem("Hack 'n Slash",GameSize.M, 59.99,1);

        var output = String.format("Your %s, %s game will cost %s.", sample.getSize(), sample.getType(), sample.getPrice());
        System.out.println(output);
    }
}
