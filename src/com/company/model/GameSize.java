package com.company.model;

/**
 * Provides short hands to be called to get typical descriptions.
 *
 * @author malik
 * @version 1.0
 * @since 03/17/2021
 */
public enum GameSize {
    //Short hands
    S("Single Area"), M("Multi Stage"), L("Open World");

    //Private variable tied to the short-hands
    private String description;

    //Sets the description based on the letter used.
    GameSize(String description) {
        this.description = description;
    }

    //Called to return the description.
    @Override
    public String toString() {
        return description;
    }
}