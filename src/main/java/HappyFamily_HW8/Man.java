package HappyFamily_HW8;

import java.util.HashMap;

public class Man extends Human{

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int IQ, Human mother, Human father, HashMap<String,String> schedule) {
        super(name, surname, year, IQ, mother, father, schedule);
    }

    public Man(String name, String surname, int year, Human mother, Human father) {
        super(name, surname, year, mother, father);
    }

    public Man() {
    }
    @Override
    public void greetPet(String nickname) {
        System.out.println(super.getName()+" is greeting "+nickname);
    }

    public void repairCar(){
        System.out.println(super.getName()+" is repairing car right now");
    }


}
