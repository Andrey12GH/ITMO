package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;

public class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setStats(65, 125, 100, 55, 70, 85);
        setMove(new Swagger(), new Submission(), new CloseCombat(), new ViceGrip());
    }
}
