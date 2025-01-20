package attacks;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat() {
        super(Type.FIGHTING, 120, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        super.applySelfEffects(att);
        att.setMod(Stat.DEFENSE, -1);
        att.setMod(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "использует Close Combat (мощная атака, но снижает свою защиту)";
    }
}
