package Happy_Family_Final;

import Dao.Gender;

import java.text.ParseException;
import java.util.HashMap;

public class Woman extends Human {

    public Woman(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public Woman(String name, String surname, long birthDate, int IQ, Human mother, Human father, HashMap<String,String> schedule) {
        super(name, surname, birthDate, IQ, mother, father, schedule);
    }

    public Woman(String name, String surname, long birthDate, Human mother, Human father) {
        super(name, surname, birthDate, mother, father);
    }

    public Woman() {
    }

    public Woman(String firstName, String lastName, long birthDate, int iq) throws ParseException {
        super(firstName,lastName,birthDate,iq);
    }

    public Woman(String firstName, String lastName, long birthDate, int iq, Human mother, Human father) {
        super(firstName,lastName,birthDate,iq,mother,father);
    }


    @Override
    public void greetPet(String nickname) {
        System.out.println(super.getName()+" is greeting "+nickname);
    }

    public void makeup(){
        System.out.println(super.getName()+" is doing makeup right now");
    }

    @Override
    public String getGender(){
        return Gender.FEMININE.name();
    }
}
