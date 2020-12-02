package com.infoshare;

public class Human {
    private String name;
    protected int health;

    public Human(String name) {
        this.name = name;
        PopulationObserver.increasePopulation();
        System.out.print("Human " + this.name + " added.");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
