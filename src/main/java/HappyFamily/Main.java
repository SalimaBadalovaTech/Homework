package HappyFamily;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Pet("Cat", "Crookshanks", 5, 10, new String[]{"meowing"});
        Human James = new Human();
        Human Harry = new Human("Harry","Potter",1992);
        James.setName("James");
        James.setName("Potter");

        Human Lily = new Human();
        Lily.setName("Lily");
        Lily.setSurname("Potter");

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
        Harry.feedPet(owl,true);


    }
}

