package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;


public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(50, 75, 35, 70, 30, 40);
        setMove(new DoubleTeam(), new EnergyBall());
    }
}
