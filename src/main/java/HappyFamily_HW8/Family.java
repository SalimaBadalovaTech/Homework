package HappyFamily_HW8;

import java.util.*;

public class Family implements HumanCreator{

    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Set<Pet> pet = new HashSet<>();

    public Family(Human mother, Human father, ArrayList<Human> children,Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet.add(pet);
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }


    public void addChild(Human human) {
        ArrayList<Human> new_children = new ArrayList<Human>();
        new_children.add(human);
        for (int i=1;i<children.size();i++){
            new_children.set(i,children.get(i));
        }
        children=new_children;
        System.out.println(human.getName()+" added to the family");
    }

    public boolean deleteChild(Human child) {
        int count = 0;
        if ((child == null) || (children == null)) {
            System.out.println("You don't have any child");
            return false;
        }

        ArrayList<Human> new_children = new ArrayList<>();
        for (int i = 0, k = 0; i < children.size(); i++) {
            if ((children.get(i) == child) || (i == children.size() - 1)) {
                continue;
            }
            new_children.add(k++,children.get(i));
            count++;
        }
        if (new_children.size()==0){
            System.out.println(child.getName()+" is not in your family");
            return false;
        }else if (count != children.size()) {
            children = new_children;
            return true;
        } else {
            return false;
        }

    }

    public void addPet(Pet pet){
        this.pet.add(pet);
        System.out.println(pet.getNickname()+" added to the list of pets");
    }

    public boolean deleteChild(int child) {
        int count = 0;
        if ((child == 0) || (children == null)||(child>children.size())) {
            System.out.println("Family is untouched");
            return false;
        }

        ArrayList<Human> new_children = new ArrayList<>();
        for (int i = 0, k = 0; i < children.size(); i++) {
            if (i==child-1) {
                continue;
            }
            new_children.add(k++, children.get(i));
            count++;
        }
        if (new_children.size()==0){
            System.out.println("You don't have "+ child+" number of children");
            return false;
        }else if (count != children.size()) {
            children = new_children;
            System.out.println("Child in the index of "+child+" has been removed from the family");
            return true;
        } else {
            return false;
        }

    }


    public int countFamily() {

        return 2 + children.size();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return mother + " " + father + " " + children.toString() + " " + pet.toString();
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family finalize called");
        super.finalize();
    }

    @Override
    public Human bornChild() {
        Random rn = new Random();
        String childName;
        int IQ = (mother.getIQ()+father.getIQ())/2;
        String[] boyNames = {"John","Severus","Albus","Neville","Tom"};
        String[] girlNames = {"Molly","Minerva","Ginny","Narcissa","Luna"};
        //If it is a boy
        if ( rn.nextInt(2)==0){
            System.out.println("Congrats, you welcome a boy to the family");
            childName = boyNames[rn.nextInt(5)];
            return new Man(childName,father.getSurname(),2022,IQ,mother,father, father.getSchedule());
        } else {
            System.out.println("Congrats, you welcome a girl to the family");
            childName = girlNames[rn.nextInt(5)];
            return new Woman(childName,father.getSurname(),2022,IQ,mother,father, father.getSchedule());
        }
    }
}







