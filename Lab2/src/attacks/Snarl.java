package attacks;

import ru.ifmo.se.pokemon.*;


public class Snarl extends SpecialMove {
    public Snarl() {
        super(Type.DARK, 55, 0.95);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Snarl (урон + понижает Sp.Atk противника)";
    }
}
