package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        super.applySelfEffects(att);
        att.setMod(Stat.EVASION, +1);
    }

    @Override
    protected String describe() {
        return "использует Double Team (повышает уклонение)";
    }
}
