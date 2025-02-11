package model;

import records.RocketInfo;

public class Rocket {
    private final RocketInfo info;
    private boolean isFunctional;

    public Rocket(RocketInfo info) {
        this.info = info;
        this.isFunctional = true;
    }

    public RocketInfo getInfo() {
        return info;
    }

    public void setFunctional(boolean functional) {
        this.isFunctional = functional;
    }

    public boolean isFunctional() {
        return isFunctional;
    }

    @Override
    public String toString() {
        return "Rocket{info=" + info + ", isFunctional=" + isFunctional + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rocket other)) return false;
        return this.info.equals(other.info) && this.isFunctional == other.isFunctional;
    }

    @Override
    public int hashCode() {
        int result = info.hashCode();
        result = 31 * result + Boolean.hashCode(isFunctional);
        return result;
    }
}
