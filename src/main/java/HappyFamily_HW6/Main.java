package HappyFamily_HW6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Pet(Species.CAT, "Crookshanks", 5, 10, new String[]{"meowing"});
        Human James = new Human();
        James.setName("James");
        James.setName("Potter");
        Human Lily = new Human();
        Lily = new Human("Lily","Potter",45);
        Lily.setName("Lily");
        Lily.setSurname("Potter");
        String[][] schedule = {{DayOfWeek.MONDAY.name(),"Go to Hogwart's"}};
        System.out.println(Arrays.deepToString(schedule));
        Human Harry = new Human("Harry","Potter",1992,50,Lily,James,schedule);
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

        Pet owl = new Pet(Species.OWL, "Hedwig", 3, 15, new String[]{"carrying letters"});
        Harry.feedPet(owl,true);
        Human Hermione = new Human("Hermione","Granger",1992,1240,Lily,James,null);
        Human Ron = new Human("Ron","Weasley",1992,1240,Lily,James,schedule);


        Family potters = new Family(Lily,James,new Human[]{Harry,Hermione},owl);
        potters.addChild(Ron);
        System.out.println(potters.toString());
        System.out.println(potters.countFamily());

        System.out.println(owl.toString());





    }
}

