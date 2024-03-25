package InheritanceProjectForClassJaita118.view;

import InheritanceProjectForClassJaita118.controller.PokemonController;
import InheritanceProjectForClassJaita118.model.Pokemon;
import InheritanceProjectForClassJaita118.model.Trainer;
import InheritanceProjectForClassJaita118.model.PokemonMove;
import InheritanceProjectForClassJaita118.pokemonTypes.FireType;
import InheritanceProjectForClassJaita118.pokemonTypes.GrassType;
import InheritanceProjectForClassJaita118.pokemonTypes.WaterType;

public class PokemonView {
    public static void main(String[] args) {
        Trainer trainerA = new Trainer("Ash", 6);
        Trainer trainerB = new Trainer("Brock", 6);

        PokemonMove[] charmanderMoves = { new PokemonMove("Ember", 50, new FireType()) };
        PokemonMove[] bulbasaurMoves = { new PokemonMove("Vine Whip", 45, new GrassType()) };
        PokemonMove[] squirtleMoves = { new PokemonMove("Water Gun", 40, new WaterType()) };
        PokemonMove[] chikoritaMoves = { new PokemonMove("Vine Whip", 45, new GrassType()) };

        Pokemon charmander = new Pokemon("Charmander", 25, new FireType(), charmanderMoves, 100);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 25, new GrassType(), bulbasaurMoves, 100);
        Pokemon squirtle = new Pokemon("Squirtle", 25, new WaterType(), squirtleMoves, 100);
        Pokemon chikorita = new Pokemon("Chikorita", 25, new GrassType(), chikoritaMoves, 100);

        PokemonController.addPokemonToTrainer(trainerA, charmander);
        PokemonController.addPokemonToTrainer(trainerA, bulbasaur);
        PokemonController.addPokemonToTrainer(trainerB, squirtle);
        PokemonController.addPokemonToTrainer(trainerB, chikorita);

        PokemonController.fight(trainerA, trainerB);
    }
}
