package com.thoughtworks.strategy;

public class NoEvolution implements EvolveBehaviour{
    @Override
    public String evolve() {
        return "No more evolution";
    }
}
