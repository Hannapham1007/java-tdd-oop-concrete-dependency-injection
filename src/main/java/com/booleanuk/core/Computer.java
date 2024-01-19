package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    // Comment from class
    // Prefer to have a new ArrayList in the constructor
    public ArrayList<Game> installedGames;
    PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply){
        this.powerSupply = powerSupply;
        this.installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> preInstalled){
        this.powerSupply = powerSupply;
        this.installedGames = new ArrayList<>();
        // Add all the collection to the installedGames
        this.installedGames.addAll(preInstalled);
    }
    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);

    }
    public String playGame(Game game) {
       if(this.installedGames.contains(game)){
           return game.start();
       }
        return "Game not installed";
    }
    }

