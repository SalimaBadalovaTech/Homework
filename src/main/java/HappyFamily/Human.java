package HappyFamily;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        return "name: " + name + ", surname: " + surname + ", year: " + year + ", IQ: " + IQ +
                ", mother: " + mother.name + ", father=: " + father.name + ", pet: " + pet;
    }


    public Human(String name, String surname, int date_of_birth, int IQ,
                 Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = date_of_birth;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int date_of_birth) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int IQ, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.IQ = IQ;

    }

    public Human() {
    }


    public static String slyness(int age) {
        String slyness;
        if (age> 50) {
            slyness = "very sly";}
        else { slyness = "almost not sly";}
        return slyness;
        }


    public static void greetPet (String nickname) {
        System.out.println("Hello, " + nickname);
    }

    public static void describePet(String species, int age) {
        System.out.println("I have a " + species + "," + "he is " + age + " years old, "
                        + "he is " + slyness(age));

    }


}
