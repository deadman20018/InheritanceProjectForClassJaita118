package InheritanceProjectForClassJaita118.model;

public class Trainer {
    private String name;
    private Pokemon[] pokemonArray;
    private int numOfPokemon;

    public Trainer(String name, int maxPokemon) {
        this.name = name;
        this.pokemonArray = new Pokemon[maxPokemon];
        this.numOfPokemon = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon[] getPokemonArray() {
        return pokemonArray;
    }

    public void setPokemonArray(Pokemon[] pokemonArray) {
        this.pokemonArray = pokemonArray;
    }

    public int getNumOfPokemon() {
        return numOfPokemon;
    }

    public void setNumOfPokemon(int numOfPokemon) {
        this.numOfPokemon = numOfPokemon;
    }
}
