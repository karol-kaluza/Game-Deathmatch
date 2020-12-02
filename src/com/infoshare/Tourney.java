package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Tourney {
    private List<ConstructedPerson> winners = new ArrayList<>();

    public void runTourney(List<ConstructedPerson> participants) {


        for (int i = 0; i < participants.size(); i += 2) {
            DeathMatch deathMatch = new DeathMatch();

            try {
                deathMatch.fight(participants.get(i), participants.get(i + 1));
            } catch(IndexOutOfBoundsException ex){
                deathMatch.setWinner(participants.get(i));
            }
            winners.add(deathMatch.getWinner());
        }
    }

    public void showWinners() {
        System.out.println("Winners:");
        for (ConstructedPerson person : winners) {
            System.out.println(person.getTheName() + " ");
        }
    }


}
