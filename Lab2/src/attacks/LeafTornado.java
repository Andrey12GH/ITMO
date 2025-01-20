package attacks;

import ru.ifmo.se.pokemon.*;

public class LeafTornado extends SpecialMove {
    public LeafTornado() {
        super(Type.GRASS, 65, 0.90);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        if (Math.random() < 0.5) {
            def.setMod(Stat.ACCURACY, -1);
            System.out.println(def + " теряет точность из-за Leaf Tornado!");
        }
    }

    @Override
    protected String describe() {
        return "использует Leaf Tornado (шанс снизить точность)";
    }
}

