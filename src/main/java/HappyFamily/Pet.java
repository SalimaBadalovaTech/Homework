package HappyFamily;

public class Pet {

    static String species;
    static String nickname;
    static int age;
    static int trickLevel;
    static String[] habits;

    public static void eat () {
        System.out.println("I am eating");

    }

    public static void respond() {
        System.out.println("Hello, owner, I am " + nickname + ". I miss you!");
    }

    public static void foul () {

        System.out.println("I need to cover up!");
    }
}
