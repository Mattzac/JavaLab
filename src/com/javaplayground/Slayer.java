package com.javaplayground;

public class Slayer extends MetalBand {

    private String who = "Slayer said: ";

    @Override
    public void numberOneHit() {
        System.out.println(who + "Raining Blood, Baby!");
    }

    @Override
    public void finisher() {
        System.out.println(who + "Tremolo Picking of cause, you fool!");
    }
}
