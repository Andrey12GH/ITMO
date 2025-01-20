package attacks;

import ru.ifmo.se.pokemon.*;


public class Submission extends PhysicalMove {
    public Submission() {
        super(Type.FIGHTING, 80, 0.80);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        // Recoil 25%
        att.setMod(Stat.HP, (int) Math.round(damage / 4.0));
    }

    @Override
    protected String describe() {
        return "использует Submission (наносит урон и получает recoil)";
    }
}
