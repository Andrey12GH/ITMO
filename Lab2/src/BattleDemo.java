import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class BattleDemo {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon pinsir      = new Pinsir("Pinsir_Alpha", 35);
        Pokemon rockruff    = new Rockruff("Rockruff_Beta", 20);
        Pokemon victreebel  = new Victreebel("Victreebel_Gamma", 40);

        b.addAlly(pinsir);
        b.addAlly(rockruff);
        b.addAlly(victreebel);

        Pokemon lycanroc    = new Lycanroc("Lycanroc_Delta", 40);
        Pokemon bellsprout  = new Bellsprout("Bellsprout_Epsilon", 15);
        Pokemon weepinbell  = new Weepinbell("Weepinbell_Zeta", 25);

        b.addFoe(lycanroc);
        b.addFoe(bellsprout);
        b.addFoe(weepinbell);

        b.go();
    }
}
