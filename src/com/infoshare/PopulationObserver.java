package com.infoshare;

public final class PopulationObserver {
    private static int population = 0;
    private static int totalBorn = 0;
    private static int totalDied = 0;

    private PopulationObserver() {
    }

    public static void increasePopulation(){
        population++;
        totalBorn++;
    }

    public static void decreasePopulation(){
        population--;
        totalDied++;
    }

    public static int getPopulation() {
        return population;
    }

    public static int getTotalBorn() {
        return totalBorn;
    }

    public static int getTotalDied() {
        return totalDied;
    }
}
