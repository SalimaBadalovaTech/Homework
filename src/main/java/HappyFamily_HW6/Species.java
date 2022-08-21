package HappyFamily_HW6;

public enum Species {
    DOG(false, 4, true),
    CAT(true, 4, true),
    RABBIT(true, 4, true),
    OWL(true, 2, false),
    FROG(false, 4, false);

    private final boolean canFly;
    private final int legs;
    private final boolean hasFur;

    Species(boolean canFly, int legs, boolean hasFur) {
        this.canFly = canFly;
        this.legs = legs;
        this.hasFur = hasFur;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
