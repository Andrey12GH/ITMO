package attacks;

import ru.ifmo.se.pokemon.*;

import java.util.Random;


public class RockClimb extends PhysicalMove {
    public RockClimb() {
        super(Type.NORMAL, 90, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        super.applyOppEffects(def);
        if (new Random().nextDouble() < 0.2) {
            Effect.confuse(def);
            System.out.println(def + " запутался из-за Rock Climb!");
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Climb (шанс запутать противника)";
    }
}

