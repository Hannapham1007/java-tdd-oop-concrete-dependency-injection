package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    // Comment from class
    // Trying to avoid create a new or initiate a new ArrayList at top of the class (ex: line 9)
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

    public void installGame(String nameGame) {
        Game game = new Game(nameGame);
        this.installedGames.add(game);

    }
    public String playGame(String nameGame) {
        for(Game game : this.installedGames) {
            if (game.name.equals(nameGame)) {
                return game.start();
            }
        }
        return "Game not installed";
    }
    }

