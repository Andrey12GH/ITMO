package attacks;

import ru.ifmo.se.pokemon.*;


public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        if (Math.random() < 0.1) {
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
            System.out.println(def + " теряет Sp.Def из-за Energy Ball!");
        }
    }

    @Override
    protected String describe() {
        return "использует Energy Ball (шанс понизить Sp.Def)";
    }
}
