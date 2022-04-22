package com.thoughtworks.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FirePokemonTest {
    @Test
    public void shouldDisplayCharmanderInfo() {
        FirePokemon charmander =  new Charmander();

        assertEquals("I'm a Charmander", charmander.display());
    }

    @Test
    public void shouldDisplayCharmeleonInfo() {
        FirePokemon charmeleon =  new Charmeleon();

        assertEquals("I'm a Charmeleon", charmeleon.display());
    }

    @Test
    public void shouldDisplayCharizardInfo() {
        FirePokemon charizard =  new Charizard();

        assertEquals("I'm a Charizard", charizard.display());
    }

}
