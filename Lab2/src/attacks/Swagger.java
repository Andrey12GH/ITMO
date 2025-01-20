package attacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        Effect.confuse(def);
        def.setMod(Stat.ATTACK, +2);
    }

    @Override
    protected String describe() {
        return "использует Swagger (сбивает цель с толку и повышает её атаку)";
    }
}
