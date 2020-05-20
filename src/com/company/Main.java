package com.company;

public class Main {

    public static void main(String[] args) {


        Slnko slnko = Slnko.getInstance();

        Planeta jupiter = new Planeta("Jupiter");
        Planeta venusa = new Planeta("venusa");
        Planeta zem = new Planeta("zem");

        slnko.addPlanet(jupiter);
        slnko.addPlanet(venusa);
        slnko.addPlanet(zem);

        Slnko slnko1 = Slnko.getInstance();

        slnko1.addPlanet(new Planeta("Merkur"));


        slnko1.printPlanets();
        System.out.println("=========================");
        slnko.printPlanets();

    }
}
