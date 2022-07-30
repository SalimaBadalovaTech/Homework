package HappyFamily;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("dog","Rock",5,75, new String[]{"eat","sleep","drink"});
        System.out.println(dog.toString());

        Human mikeMommy = new Human();
        mikeMommy.name = "Jane Karleone";

        Human mikeDaddy = new Human();
        mikeDaddy.name = "Vita Karleone";

        Human Mike = new Human("Michael", "Karleone", 1977, 75, mikeMommy,
                                mikeDaddy, dog);
        System.out.println(Mike);


        Pet cat = new Pet("Cat","Crookshanks",5,10,new String[]{"meowing"});

        Human James = new Human();
        James.name = "James";
        James.surname = "Potter";

        Human Lily = new Human();
        Lily.name = "Lily";
        Lily.surname = "Potter";

        Human Harry = new Human("Harry", "Potter",1997  ,99,cat,Lily,James,
                new String[][] {{"Monday","Expelliamus"},{"Tuesday","Beating Malfoy"}});

        System.out.println(Harry.toString());

        Pet.eat();
        Pet.foul();
        Pet.respond(cat.nickname);
        Human.describePet(cat.species, cat.age);
        Human.greetPet(cat.nickname);
    }

}
