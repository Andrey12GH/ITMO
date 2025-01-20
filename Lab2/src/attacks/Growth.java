package attacks;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        super.applySelfEffects(att);
        att.setMod(Stat.ATTACK, +1);
        att.setMod(Stat.SPECIAL_ATTACK, +1);
    }

    @Override
    protected String describe() {
        return "использует Growth (повышает свою Atk и Sp.Atk)";
    }
}
