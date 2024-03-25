package InheritanceProjectForClassJaita118.model;

import InheritanceProjectForClassJaita118.pokemonTypes.PokemonType;

public class PokemonMove {
    private String name;
    private int power;
    private PokemonType type;

    public PokemonMove(String name, int power, PokemonType type) {
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public PokemonType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Move: " + name + "\nPower: " + power + "\nType: " + type.getName();
    }
}
