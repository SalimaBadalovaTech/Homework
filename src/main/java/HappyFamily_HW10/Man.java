package HappyFamily_HW10;

import java.util.HashMap;

public class Man extends Human{

    public Man(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public Man(String name, String surname, long birthDate, int IQ, Human mother, Human father, HashMap<String,String> schedule) {
        super(name, surname, birthDate, IQ, mother, father, schedule);
    }

    public Man(String name, String surname, long birthDate, Human mother, Human father) {
        super(name, surname, birthDate, mother, father);
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
