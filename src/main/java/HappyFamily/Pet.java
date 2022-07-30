package HappyFamily;

import java.util.Arrays;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits = new String[3];

    public String toString() {
        return "nickame: " + nickname + ", age: " + age + "," +
                " tricklevel: " + trickLevel + ", habits: " + Arrays.toString(habits);
    }


    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }


    public static void eat () {
        System.out.println("I am eating");

    }

    public static void respond(String nickname) {
        System.out.println("Hello, owner, I am " + nickname + ". I miss you!");
    }

    public static void foul () {

        System.out.println("I need to cover up!");
    }


}


