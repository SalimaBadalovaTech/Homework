package HappyFamily;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Pet("Cat", "Crookshanks", 5, 10, new String[]{"meowing"});

        Human James = new Human();
        James.setName("James");
        James.setName("Potter");

        Human Lily = new Human();
        Lily.setName("Lily");
        Lily.setSurname("Potter");

        Human Harry = new Human("Harry", "Potter", 1997, 99, cat, Lily, James,
                new String[][]{{"Monday", "Expelliamus"}, {"Tuesday", "Beating Malfoy"}});

        System.out.println(Harry.toString());

        Pet.eat();
        Pet.foul();
        Pet.respond(cat.getNickname());
        Human.describePet(cat.getSpecies(), cat.getAge());
        Human.greetPet(cat.getNickname());

        Human grandma1 = new Human();
        grandma1.setName("Bellatrix Lestrange");

        Human grandpa1 = new Human();
        grandpa1.setName("Lucius Malfoy");

        Human grandma2 = new Human();
        grandma2.setName("Petunia Dursley");

        Human grandpa2 = new Human();
        grandpa2.setName("Remus Lupin");

        Pet owl = new Pet("Bird", "Hedwig", 3, 15, new String[]{"carrying letters"});

        Human mother = new Human("Molly", "Weasley", 1961, 100,
                owl, grandma1, grandpa1, new String[][]{{"Monday"}, {"working"}});
        Human father = new Human("Arthur", "Weasley", 1961, 90,
                owl, grandma2, grandpa2, new String[][]{{"Tuesday"}, {"Working with muggles"}});
        Human[] children;

        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(owl.toString());

    }
}

