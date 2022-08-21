package HappyFamily;

import java.util.Arrays;

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



    public static void addChild(Human human, int ith_Child, int numberOfChildren) {

        Human a = new Human();

        Human[] children = new Human[numberOfChildren];
        children[ith_Child] = a;

    }

    public static boolean deleteChildren(int ith_Child, Human[] children) {

        return true;
    }

    public static int countFamily(Human[] children) {

        int count = 2 + children.length;
        return count;
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
        return mother + " " + father + " " + Arrays.toString(children) + " " + pet.getNickname();
    }
}







