import java.util.ArrayList;

public class PokemonLevels {
    private ArrayList<Integer> levels;

    public PokemonLevels(
        int lvl1,
        int lvl2,
        int lvl3,
        int lvl4,
        int lvl5,
        int lvl6,
        int lvl7,
        int lvl8,
        int lvl9,
        int lvl10
        ){
            this.levels = new ArrayList<>();
            this.levels.add(lvl1);
            this.levels.add(lvl2);
            this.levels.add(lvl3);
            this.levels.add(lvl4);
            this.levels.add(lvl5);
            this.levels.add(lvl6);
            this.levels.add(lvl7);
            this.levels.add(lvl8);
            this.levels.add(lvl9);
            this.levels.add(lvl10);
    }
}
