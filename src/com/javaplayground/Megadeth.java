package com.javaplayground;

public class Megadeth extends MetalBand{

    private String who = "Megadeth said: ";

    @Override
    public void numberOneHit() {
        System.out.println(who + "Tornado of souls! Gosh!");
    }

    @Override
    public void finisher() {
        System.out.println(who + "What!? We are fucking Megadeth, What more can we say!?");
    }
}
