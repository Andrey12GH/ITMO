package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

/**
 * Rockruff (первая стадия, эволюция -> Lycanroc)
 */
public class Rockruff extends Pokemon {
    public Rockruff(String name, int level) {
        super(name, level);
        setType(Type.ROCK);
        setStats(45, 65, 40, 30, 40, 60);
        // 3 атаки
        setMove(new Snarl(), new RockTomb(), new RockClimb());
    }
}
