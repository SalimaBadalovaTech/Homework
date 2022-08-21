package HappyFamily_HW6;

import java.util.Arrays;

public class Pet {

    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = new String[3];

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }

    public String getSpecies() {
        return species.name();
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species.name() + ", legs=" + species.getLegs() + ", canFly=" + species.isCanFly() + ", hasFur=" + species.isHasFur() +
                " {nickame: " + nickname + ", age: " + age + "," +
                " tricklevel: " + trickLevel + ", habits: " + Arrays.toString(habits) + "}";
    }


    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public static void eat() {
        System.out.println("I am eating");
    }

    public static void respond(String nickname) {
        System.out.println("Hello, owner, I am " + nickname + ". I miss you!");
    }

    public static void foul() {
        System.out.println("I need to cover up!");
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet finalize called");
        super.finalize();
    }
}


