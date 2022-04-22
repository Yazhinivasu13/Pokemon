package com.thoughtworks.strategy;

public abstract class FirePokemon {
    public String attack() {
        return "Attackkk!";
    }

    public String defend() {
        return "Observe opponent - so defend";
    }

    public abstract String display();
}
