package HappyFamily_HW10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public abstract class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int IQ;
    private Human mother;
    private Human father;
    private HashMap<String ,String> schedule;

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.schedule=new HashMap<>();
    }

    public Human(String name, String surname, long birthDate, int IQ, Human mother, Human father, HashMap<String ,String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.IQ = IQ;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, Date birthDate, int IQ) throws ParseException {
        this.name=name;
        this.surname=surname;
        this.IQ=IQ;
        this.birthDate = birthDate.toInstant().toEpochMilli();
    }

    public Human(String name, String surname, long birthDate, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
        this.schedule=new HashMap<>();
    }

    public Human() {
        this.schedule=new HashMap<>();
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public HashMap getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String,String > schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String  str = schedule.toString();
        return "Human{name='"+name+"', surname='"+surname+"', year="+
                df.format(new Date(birthDate)) + ", iq="+IQ+
                ", schedule="+ str;
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
    public Period describeAge(long birthdate) throws ParseException {
        LocalDate date1 = new Date(birthdate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = LocalDate.now();
        System.out.println(date1 + " "+ date2);
        Period period = date2.until(date1);
        System.out.println(this.name + " is "+Math.abs(period.getYears())+" years, "+Math.abs(period.getMonths())+" months "+
                " and "+Math.abs(period.getDays())+" days old");
        return period;
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
