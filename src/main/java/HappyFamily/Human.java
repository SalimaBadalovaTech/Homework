package HappyFamily;

public class Human {

    String name;
    String surname;
    int date_of_birth;
    int IQ;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][1];

    public static String slyness() {
        String slyness;
        if (Pet.age> 50) {
            slyness = "very sly";}
        else { slyness = "almost not sly";}
        return slyness;
        }


    public static void greetPet () {
        System.out.println("Hello, " + Pet.nickname);
    }

    public static void describePet() {
        System.out.println("I have a " + Pet.species + ", he is " + Pet.age + "years old, "
                        + "he is " + slyness());

    }
}
