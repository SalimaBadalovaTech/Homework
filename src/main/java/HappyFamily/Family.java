package HappyFamily;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Family {

  Human mother;
  Human father;
  Human[] children;
  Pet pet;

  public Family(Human mother, Human father, Human[] children, Pet pet) {
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
  }

public static void to_welcome_the_favorite (String name) {

  System.out.println("Welcome, " + name);
}

  public static void describe_the_favorite (Human human) {

    System.out.println(human.toString());
  }

  public static void feed (Human human) {
    Human a = new Human();

    System.out.println("I am feeding " + a.getName());
  }

  public static void addChild (Human human, int ith_Child, int numberOfChildren) {

    Human a = new Human();

    Human[] children = new Human[numberOfChildren];
    children[ith_Child] = a;

  }

  public static boolean deleteChildren (int ith_Child, Human[] children) {

      return true;
  }

public static int countFamily (Human[] children) {

    int count = 2  + children.length;
    return count;
}


  }







