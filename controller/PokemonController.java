package InheritanceProjectForClassJaita118.controller;

import InheritanceProjectForClassJaita118.model.Pokemon;
import InheritanceProjectForClassJaita118.model.Trainer;
import InheritanceProjectForClassJaita118.model.PokemonMove;

import java.util.Random;

public class PokemonController {
    private static Random random = new Random();

    public static void addPokemonToTrainer(Trainer trainer, Pokemon pokemon) {
        if (trainer.getNumOfPokemon() < trainer.getPokemonArray().length) {
            trainer.getPokemonArray()[trainer.getNumOfPokemon()] = pokemon;
            trainer.setNumOfPokemon(trainer.getNumOfPokemon() + 1);
            System.out.println(pokemon.getName() + " added to your team.");
        } else {
            System.out.println("Your Pokemon team is full. You cannot add more Pokemon.");
        }
    }

    public static void fight(Trainer trainerA, Trainer trainerB) {
        if (trainerA.getNumOfPokemon() == 0 || trainerB.getNumOfPokemon() == 0) {
            System.out.println("One of the trainers doesn't have any Pokemon to fight!");
            return;
        }

        Pokemon pokemonA = trainerA.getPokemonArray()[random.nextInt(trainerA.getNumOfPokemon())];
        Pokemon pokemonB = trainerB.getPokemonArray()[random.nextInt(trainerB.getNumOfPokemon())];

        System.out.println("Trainer A sends out " + pokemonA.getName() + "!");
        System.out.println("Trainer B sends out " + pokemonB.getName() + "!\n");

        while (pokemonA.getHp() > 0 && pokemonB.getHp() > 0) {
            attack(pokemonA, pokemonB);
            if (pokemonB.getHp() <= 0) {
                System.out.println(pokemonA.getName() + " wins!");
                break;
            }

            attack(pokemonB, pokemonA);
            if (pokemonA.getHp() <= 0) {
                System.out.println(pokemonB.getName() + " wins!");
                break;
            }
        }
    }

    private static void attack(Pokemon attacker, Pokemon defender) {
        PokemonMove[] moves = attacker.getMoves();
        PokemonMove mostDamagingMove = getMostDamagingMove(attacker, defender);

        double effectiveness = mostDamagingMove.getType().getEffectivenessAgainst(defender.getType());
        int damage = (int) (mostDamagingMove.getPower() * effectiveness);

        System.out.println(attacker.getName() +
                " uses " + mostDamagingMove.getName() + " and deals " + damage + " damage.");

        defender.setHp(defender.getHp() - damage);
        if (defender.getHp() <= 0) {
            System.out.println(attacker.getName() + " deals " + damage + " damage, killing " + defender.getName());
        }
    }

    private static PokemonMove getMostDamagingMove(Pokemon attacker, Pokemon defender) {
        PokemonMove[] moves = attacker.getMoves();
        PokemonMove mostDamagingMove = moves[0];
        double highestDamage = 0;

        for (PokemonMove move : moves) {
            double effectiveness = move.getType().getEffectivenessAgainst(defender.getType());
            double damage = move.getPower() * effectiveness;

            if (damage > highestDamage) {
                highestDamage = damage;
                mostDamagingMove = move;
            }
        }

        return mostDamagingMove;
    }
    public static void capturePokemon(Trainer trainer, Pokemon pokemon) {
        if (trainer.getNumOfPokemon() < trainer.getPokemonArray().length) {
            trainer.getPokemonArray()[trainer.getNumOfPokemon()] = pokemon;
            trainer.setNumOfPokemon(trainer.getNumOfPokemon() + 1);
            System.out.println("You captured " + pokemon.getName() + "!");
        } else {
            System.out.println("Your Pokemon team is full. You cannot capture more Pokemon.");
        }
    }
}
