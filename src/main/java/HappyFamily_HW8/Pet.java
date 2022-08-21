package HappyFamily_HW8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Pet {

    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet habits = new HashSet<>();

    public Pet( String nickname, int age, int trickLevel, HashSet habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet() {
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

    public  HashSet<String> getHabits() {
        return habits;
    }

    public void addHabits(String habit) {
        habits.add(habit);
    }

    @Override
    public String toString() {
        return " {nickame: " + nickname + ", age: " + age + "," +
                " tricklevel: " + trickLevel + ", habits: " + habits.toString() + "}";
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

    public abstract void respond(String nickname) ;

    public abstract void foul() ;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pet finalize called");
        super.finalize();
    }
}

