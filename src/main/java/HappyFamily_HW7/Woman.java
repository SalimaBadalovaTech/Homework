package HappyFamily_HW7;

public class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int IQ, Human mother, Human father, String[][] schedule) {
        super(name, surname, year, IQ, mother, father, schedule);
    }

    public Woman(String name, String surname, int year, Human mother, Human father) {
        super(name, surname, year, mother, father);
    }

    public Woman() {
    }

    @Override
    public void greetPet(String nickname) {
        System.out.println(super.getName()+" is greeting "+nickname);
    }

    public void makeup(){
        System.out.println(super.getName()+" is doing makeup right now");
    }
}
