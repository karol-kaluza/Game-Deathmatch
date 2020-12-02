package com.infoshare;

public class DeathMatch {
    private int rounds = 0;
    private ConstructedPerson winner;

    public void fight(ConstructedPerson fighter1, ConstructedPerson fighter2){
        while(fighter1.isAlive() && fighter2.isAlive()){
            fighter1.attack(fighter2);
            if(fighter2.isAlive()) {
                fighter2.attack(fighter1);
            }
            rounds++;
        }

        if(fighter1.isAlive()){
            winner = fighter1;
        } else {
            winner = fighter2;
        }

        PopulationObserver.decreasePopulation();

        System.out.println(rounds + " rounds fight. Winner is: " + fighter1.getTheName());
    }

    public ConstructedPerson getWinner() {
        return winner;
    }

    public void setWinner(ConstructedPerson winner) {
        this.winner = winner;
    }
}
