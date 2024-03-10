import java.util.ArrayList;

public class StartingPokemons {
    
    public void createBulbasaur() {

        PokemonAttack attack1 = new PokemonAttack("Tackle", 40, 0.05f);
        PokemonAttack attack2 = new PokemonAttack("Vine Whip", 45, 0.1f);
        PokemonAttack attack3 = new PokemonAttack("Razor Leaf", 50, 0.15f);

        PokemonLevels levels = new PokemonLevels(64, 125, 216, 343, 512, 729, 1000, 1331, 1728, 2197);



        Pokemon bulbasaur = new Pokemon(
            1,
            "Bulbasaur",
            "Grass/Poison",
            "Bulbasaur is a small, quadrupedal Pokémon with blue-green skin and a plant bulb on its back.",
            45,
            1,
            attack1,
            attack2,
            attack3,
            levels

        );
        System.out.println("Name: " + bulbasaur.getName());


    }




}