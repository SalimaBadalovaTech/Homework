package HappyFamily_HW7;

import java.util.Arrays;
import java.util.Random;

public abstract class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule=new String[2][];
    }

    public Human(String name, String surname, int year, int IQ, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.schedule=new String[2][];
    }

    public Human() {
        this.schedule=new String[2][];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        return "Human{name='"+name+"', surname='"+surname+"', year="+year+", iq="+IQ+
                ", schedule="+ Arrays.deepToString(schedule);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static String slyness(int age) {
        String slyness;
        if (age> 50) {
            slyness = "very sly";}
        else { slyness = "almost not sly";}
        return slyness;
        }

    public abstract void greetPet (String nickname);

    public static void describePet(String species, int age) {
        System.out.println("I have a " + species + "," + "he is " + age + " years old, "
                        + "he is " + slyness(age));

    }

    public static void to_welcome_the_favorite(String name) {

        System.out.println("Welcome, " + name);
    }

    public static void describe_the_favorite(Human human) {

        System.out.println(human.toString());
    }

    public static void feed(Human human) {
        System.out.println("I am feeding " + human.getName());
    }

    public boolean feedPet(Pet pet, boolean feed){
        if (feed){
            System.out.println("Hm... I will feed "+name+"'s "+ pet.getNickname());
            return true;
        } else {
            int trick_number = (int)(Math.random()*100);
            if (trick_number>pet.getTrickLevel()){
                System.out.println("Hm... I will feed "+name+"'s"+ pet.getNickname());
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human finalize called");
        super.finalize();
    }
}
