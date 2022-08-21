package HappyFamily_HW8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pet cat = new DomesticCat("Crookshanks", 5, 10, new HashSet<>());
        cat.addHabits("Meowing");
        Human James = new Man();
        James.setName("James");
        James.setName("Potter");
        Human Lily = new Woman();
        Lily = new Woman("Lily","Potter",45);
        Lily.setName("Lily");
        Lily.setSurname("Potter");
        HashMap<String ,String > schedule =new HashMap<>();
        schedule.put(DayOfWeek.MONDAY.name(),"Go to the shopping");
        Human Harry = new Man("Harry","Potter",1992,50,Lily,James,schedule);
        System.out.println(Harry.toString());

        Pet.eat();
        Harry.greetPet("Hedwig");
        Human grandma1 = new Woman();
        grandma1.setName("Bellatrix Lestrange");

        Human grandpa1 = new Man();
        grandpa1.setName("Lucius Malfoy");

        Human grandma2 = new Woman();
        grandma2.setName("Petunia Dursley");

        Human grandpa2 = new Man();
        grandpa2.setName("Remus Lupin");

        Dog owl = new Dog("Hedwig", 3, 15,new HashSet<>());
        owl.addHabits("WhoWhoing");
        Harry.feedPet(owl,true);
        Human Hermione = new Woman("Hermione","Granger",1992,1240,Lily,James,null);
        Human Ron = new Man("Ron","Weasley",1992,1240,Lily,James,schedule);


        Family potters = new Family(Lily,James,new ArrayList<>(),owl);
        potters.addChild(Ron);
        System.out.println(potters.toString());
        System.out.println(potters.countFamily());

        System.out.println(owl.toString());

        Human new_child = potters.bornChild();
        System.out.println(new_child.getName());

        Fish dory = new Fish("Dory", 3, 15,new HashSet<>());
        potters.addPet(dory);

    }
}

