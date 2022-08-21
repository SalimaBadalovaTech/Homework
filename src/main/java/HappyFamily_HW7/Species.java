package HappyFamily_HW7;

public enum Species {
    DOG(false, 4, true),
    ROBOCAT(false, 4, true),
    DOMESTICCAT(false, 4, true),
    FISH(false, 0, false),
    UNKNOWN(false,0,false);

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
