package com.infoshare;

public final class NumberGenerator {
    private NumberGenerator() {
    }

    public static int generateHealth(){
        return (int)(Math.random() * 1000);
    }

    public static int generateDamage(){
        return (int)(Math.random() * 100);
    }
}
