package InheritanceProjectForClassJaita118.pokemonTypes;

public class PokemonType {
    private String name;
    private PokemonType[] weaknesses;
    private PokemonType[] strengths;

    public PokemonType(String name) {
        this.name = name;
        this.weaknesses = new PokemonType[0];
        this.strengths = new PokemonType[0];
    }

    public String getName() {
        return name;
    }
    public boolean isWeakAgainst(PokemonType type) {
        for (int i = 0; i < weaknesses.length; i++) {
            if (weaknesses[i].equals(type)) {
                return true;
            }
        }
        return false;
    }

    public boolean isStrongAgainst(PokemonType type) {
        for (int i = 0; i < strengths.length; i++) {
            if (strengths[i].equals(type)) {
                return true;
            }
        }
        return false;
    }

    public double getEffectivenessAgainst(PokemonType otherType) {
        if (isWeakAgainst(otherType)) {
            return 2.0;
        } else if (isStrongAgainst(otherType)) {
            return 0.5;
        } else {
            return 1.0;
        }
    }
}