package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Lycanroc extends Rockruff {
    public Lycanroc(String name, int level) {
        super(name, level);
        setStats(75, 115, 65, 55, 65, 112);
        addMove(new QuickAttack());
    }
}
