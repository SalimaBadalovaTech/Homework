package HappyFamily_HW10;

import java.util.HashSet;

public class Dog extends Pet {

    private static Species species = Species.DOG;

    public Dog(String nickname, int age, int trickLevel, HashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public static Species getSpecies() {
        return species;
    }

    @Override
    public void respond(String nickname) {
        System.out.println("Hello, owner, I am " + super.getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I am a dog and I need to cover up!");
    }
}
