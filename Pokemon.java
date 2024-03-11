import java.util.ArrayList;

public class Pokemon {
    protected int id;
    private String name;
    private String type;
    private String pokemonDescription;
    private ArrayList<PokemonAttack> attack;
    private int hp;
    private PokemonLevels pokemonLevels;
    protected int currentLvl;
    private  WeekAgainst weekAgainst;



    public Pokemon(int id, String name, String type, String pokemonDescription, int hp, int currentLvl, PokemonAttack attack1, PokemonAttack attack2, PokemonAttack attack3, PokemonLevels pokemonLevels,WeekAgainst weekAgainst){
        this.id = id;
        this.name = name;
        this.type = type;
        this.pokemonDescription = pokemonDescription;
        this.hp = hp;
        this.currentLvl = currentLvl;
        // Initialize the attack array
        this.attack = new ArrayList<>();

        // Add PokemonAttack objects to the attack array
        this.attack.add(attack1);
        this.attack.add(attack2);
        this.attack.add(attack3);

        this.pokemonLevels = pokemonLevels;
        this.weekAgainst = weekAgainst;
    }
    public String getName() {
        return name;
    }

    
}
