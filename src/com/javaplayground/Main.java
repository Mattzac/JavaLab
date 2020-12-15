package com.javaplayground;

public class Main {

    public static void main(String[] args) {
        MetalBand band1 = new Slayer();
        MetalBand band2 = new Megadeth();
        MetalBand band3 = new Metallica();

        band3.finisher();
        band1.rockOnStage();
        band2.numberOneHit();
    }
}
