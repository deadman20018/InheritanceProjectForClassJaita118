package InheritanceProjectForClassJaita118.model;

import InheritanceProjectForClassJaita118.pokemonTypes.PokemonType;

public class Pokemon {
    private String name;
    private int level;
    private PokemonType type;
    private PokemonMove[] moves;
    private int hp;

    public Pokemon(String name, int level, PokemonType type, PokemonMove[] moves, int hp) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.moves = moves;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public PokemonMove[] getMoves() {
        return moves;
    }

    public void setMoves(PokemonMove[] moves) {
        this.moves = moves;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        StringBuilder movesList = new StringBuilder();
        for (PokemonMove move : moves) {
            movesList.append("\n- ").append(move.getName());
        }
        return "Name: " + name + "\nLevel: " + level + "\nType: " + type.getName() + "\nHP: " + hp + "\nMoves:" + movesList;
    }
}
