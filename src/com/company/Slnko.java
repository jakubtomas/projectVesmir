package com.company;

import java.util.ArrayList;
import java.util.List;

public class Slnko {

    private static List<Planeta> listPlanets = new ArrayList<>();
    private static final Slnko instance = new Slnko();


    private Slnko(){}


    public void addPlanet(Planeta planeta) {
        listPlanets.add(planeta);

    }


    public static Slnko getInstance(){
        if(instance == null ){
            return instance= new Slnko();
        }
        return instance;
    }

    public void printPlanets(){
        for (Planeta planeta : listPlanets) {
            System.out.println(planeta.getName());
        }
    }

}
