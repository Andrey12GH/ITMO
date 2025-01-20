package attacks;

import ru.ifmo.se.pokemon.*;


public class ViceGrip extends PhysicalMove {
    public ViceGrip() {
        super(Type.NORMAL, 55, 1.0);
    }

    @Override
    protected String describe() {
        return "применяет Vice Grip (сильный захват)";
    }
}
