package com.company;

public enum GameSize {
    S("Single Area"), M("Multi Stage"), L("Open World");

    private String description;

    GameSize(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}