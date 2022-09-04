package HappyFamily_HW10;

import Dao.FamilyController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {
        FamilyController familyController=new FamilyController();
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
        Human Harry = new Man("Harry","Potter",289780645573L,50,Lily,James,schedule);
        System.out.println(Harry);
        Harry.describeAge(Harry.getBirthDate());

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
        potters.toString();
        System.out.println(potters.countFamily());

        owl.toString();

        Human new_child = potters.bornChild();
        System.out.println(new_child.getName());

        Fish dory = new Fish("Dory", 3, 15,new HashSet<>());
        potters.addPet(dory);
        familyController.saveFamily(potters);
        System.out.println(familyController.count());



    }
}

