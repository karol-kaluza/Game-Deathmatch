package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tourney tourney = new Tourney();
        List<ConstructedPerson> participants = new ArrayList<>();

        participants.add(new Barbarian("Barbarian1", NumberGenerator.generateHealth()));
        participants.add(new Warrior("Warrior1", NumberGenerator.generateHealth()));
        participants.add(new Warrior("Warrior2", NumberGenerator.generateHealth()));
        participants.add(new Knight("Knight1", NumberGenerator.generateHealth()));
        participants.add(new Barbarian("Barbarian2", NumberGenerator.generateHealth()));
        participants.add(new Knight("Knight2", NumberGenerator.generateHealth()));

        showPopulation();
        tourney.runTourney(participants);
        tourney.showWinners();
        showPopulation();

    }
    public static void showPopulation(){
        System.out.println("----------------------------------------------");
        System.out.print("Total population: " + PopulationObserver.getPopulation()+" | ");
        System.out.print("Total born: " + PopulationObserver.getTotalBorn()+" | ");
        System.out.print("Total died: " + PopulationObserver.getTotalDied()+" ");
        System.out.println(" ");
    }
}
