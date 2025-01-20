package attacks;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack() {
        super(Type.NORMAL, 40, 1.0, 1, 1);
    }

    @Override
    protected String describe() {
        return "применяет Quick Attack (быстрая приоритетная атака)";
    }
}
