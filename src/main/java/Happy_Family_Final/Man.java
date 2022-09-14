package Happy_Family_Final;

import Dao.Gender;

import java.text.ParseException;
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

    public Man(String firstName, String lastName, long birthDate, int iq) throws ParseException {
        super(firstName,lastName,birthDate,iq);
    }

    @Override
    public void greetPet(String nickname) {
        System.out.println(super.getName()+" is greeting "+nickname);
    }

    public void repairCar(){
        System.out.println(super.getName()+" is repairing car right now");
    }

    @Override
    public String getGender(){
        return Gender.MASCULINE.name();
    }


}
