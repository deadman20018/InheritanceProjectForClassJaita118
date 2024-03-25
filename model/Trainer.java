package InheritanceProjectForClassJaita118.model;

public class Trainer {
    private String name;
    private Pokemon[] pokemonList;
    private int numOfPokemon;

    public Trainer(String name, int maxPokemon) {
        this.name = name;
        this.pokemonList = new Pokemon[maxPokemon];
        this.numOfPokemon = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon[] getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(Pokemon[] pokemonList) {
        this.pokemonList = pokemonList;
    }

    public int getNumOfPokemon() {
        return numOfPokemon;
    }

    public void setNumOfPokemon(int numOfPokemon) {
        this.numOfPokemon = numOfPokemon;
    }
}
