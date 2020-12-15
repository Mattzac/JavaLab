package com.javaplayground;

public class Metallica extends MetalBand{

    private String who = "Metallica said: ";

    @Override
    public void numberOneHit() {
        System.out.println(who + "Master of Puppets, duh");
    }

    @Override
    public void finisher() {
        System.out.println(who + "insane down picking skill, at the age of 65, James");
    }
}
