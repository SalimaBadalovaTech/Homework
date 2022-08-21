package HappyFamily_HW6;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[5];
    }


    public void addChild(Human human) {
        Human[] new_children = new Human[children.length + 1];
        new_children[children.length]=human;
        for (int i=1;i<children.length;i++){
            new_children[i]=children[i];
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

        Human[] new_children = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if ((children[i] == child) || (i == children.length - 1)) {
                continue;
            }
            new_children[k++] = children[i];
            count++;
        }
        if (new_children.length==0){
            System.out.println(child.getName()+" is not in your family");
            return false;
        }else if (count != children.length) {
            children = new_children;
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteChild(int child) {
        int count = 0;
        if ((child == 0) || (children == null)||(child>children.length)) {
            System.out.println("Family is untouched");
            return false;
        }

        Human[] new_children = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if (i==child-1) {
                continue;
            }
            new_children[k++] = children[i];
            count++;
        }
        if (new_children.length==0){
            System.out.println("You don't have "+ child+" number of children");
            return false;
        }else if (count != children.length) {
            children = new_children;
            System.out.println("Child in the index of "+child+" has been removed from the family");
            return true;
        } else {
            return false;
        }

    }


    public int countFamily() {

        return 2 + children.length;
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
        return mother + " " + father + " " + Arrays.toString(children) + " " + pet.toString();
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family finalize called");
        super.finalize();
    }
}







