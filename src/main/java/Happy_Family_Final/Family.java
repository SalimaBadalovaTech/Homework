package Happy_Family_Final;

import Dao.Gender;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.*;

public class Family implements HumanCreator {

    private Human mother = new Woman();
    private Human father = new Man();
    private static ArrayList<Human> children;
    private Set<Pet> pet = new HashSet<>();

    public Family() {

    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet.add(pet);
    }

    public Family(Human mother, Human father, ArrayList<Human> children, Set<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
    }


    public void addChild(Human human) {
        ArrayList<Human> new_children = new ArrayList<Human>();
        new_children.add(human);
        for (int i = 1; i < children.size(); i++) {
            new_children.set(i, children.get(i));
        }
        children = new_children;
        System.out.println(human.getName() + " added to the family");
    }

    public static boolean deleteChild(Human child) {
        System.out.println("delete child called");
        int count = 0;
        if ((child == null) || (children == null)) {
            System.out.println("You don't have any child");
            return false;
        }

        ArrayList<Human> new_children = new ArrayList<>();
        for (int i = 0, k = 0; i < children.size(); i++) {
            if ((children.get(i) == child)) {
                children.remove(child);
                return true;
            }

        }
        return false;
    }

    public void addPet(Pet pet) {
        this.pet.add(pet);
        System.out.println(pet.getNickname() + " added to the list of pets");
    }

    public boolean deleteChild(int child) {
        int count = 0;
        if ((child == 0) || (children == null) || (child > children.size())) {
            System.out.println("Family is untouched");
            return false;
        }

        ArrayList<Human> new_children = new ArrayList<>();
        for (int i = 0, k = 0; i < children.size(); i++) {
            if (i == child - 1) {
                continue;
            }
            new_children.add(k++, children.get(i));
            count++;
        }
        if (new_children.size() == 0) {
            System.out.println("You don't have " + child + " number of children");
            return false;
        } else if (count != children.size()) {
            children = new_children;
            System.out.println("Child in the index of " + child + " has been removed from the family");
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

        return mother + " " + father + " " + children.toString() + pet;
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
        int IQ = (mother.getIQ() + father.getIQ()) / 2;
        String[] boyNames = {"John", "Severus", "Albus", "Neville", "Tom"};
        String[] girlNames = {"Molly", "Minerva", "Ginny", "Narcissa", "Luna"};
        //If it is a boy
        if (rn.nextInt(2) == 0) {
            System.out.println("Congrats, you welcome a boy to the family");
            childName = boyNames[rn.nextInt(5)];
            return new Man(childName, father.getSurname(), 2022, IQ, mother, father, father.getSchedule());
        } else {
            System.out.println("Congrats, you welcome a girl to the family");
            childName = girlNames[rn.nextInt(5)];
            return new Woman(childName, father.getSurname(), 2022, IQ, mother, father, father.getSchedule());
        }
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public static void setChildren(ArrayList<Human> children) {
        Family.children = children;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public HashMap<String, String> readHashMap(String result) {
        HashMap<String, String> endResult = new HashMap<>();
        String[] myArray = result.replace("{", "").replace("}", "").split(",");
        for (String string : myArray) {
            String[] temp = string.split("=");
            endResult.put(temp[0], temp[1]);
        }
        return endResult;
    }

    private Human readHuman(String[] array) throws ParseException {

        System.out.println(array[7]);
        String gender = array[0];
        String firstName = array[1];
        String lastName = array[2];
        Human father = null;
        Human mother = null;
        int IQ = Integer.parseInt(array[4]);
        long birthDate = Long.parseLong(array[3]);
        HashMap<String, String> mySchedule = new HashMap<>();
        if (!Objects.equals(array[6], "null")) {
            String[] result = array[6].replace("{", "").replace("}", "").split("\\|");
            System.out.println(Arrays.toString(result));
            father = readHuman(result);
        }

        if (!Objects.equals(array[5], "null")) {
            String[] result = array[5].replace("{", "").replace("}", "").split("\\|");
            mother = readHuman(result);
        }

        if (!Objects.equals(array[7], "{}") && !array[7].equals(" ")) {
            System.out.println("entered to read hashmap");
            mySchedule = readHashMap(array[7]);
        }
        if (Objects.equals(gender, Gender.MASCULINE.name())) {
            return new Woman(firstName, lastName, birthDate, IQ, mother, father, mySchedule);
        } else if (Objects.equals(gender, Gender.FEMININE.name())) {
            return new Man(firstName, lastName, birthDate, IQ, mother, father, mySchedule);
        }
        return null;
    }

    private StringBuilder readSchedule(HashMap<String, String> tempSchedule) {
        StringBuilder str = new StringBuilder(" ");
        if (tempSchedule != null) {
            for (Map.Entry<String, String> values : tempSchedule.entrySet()) {
                str.append(values.getKey()).append("=").append(values.getValue()).append(";");
            }
        }
        return str;
    }

    public Family fileReader() throws IOException, ParseException {
        File file = new File(
                "C:\\Users\\QuluzadaNM\\Desktop\\Data\\Homework\\Homeworks\\families.txt");
        List<String> productLines = Files.readAllLines(java.nio.file.Paths.get("families.txt"), StandardCharsets.UTF_8);

        Human father = new Man();
        Human mother = new Woman();
        ArrayList<Human> newChildren = new ArrayList<>();
        Human child = new Man();
        Set<Pet> newPets = new HashSet<>();
        Pet pet1 = new DomesticCat();
        Family newFamily = new Family();
        for (String line : productLines) {


            String[] tokens = line.split("-");
            String[] fatherString = tokens[1].split(",");
            String[] motherString = tokens[0].split(",");
            String[] childrenString = tokens[2].split(",");
            father = readHuman(fatherString);
            mother = readHuman(motherString);
            newFamily = new Family(mother, father);
        }
        return newFamily;
    }

    public void saveFamilyToFile() throws IOException, IllegalAccessException {
        StringBuilder sb = new StringBuilder();

        Family family = new Family(mother, father, children, this.pet);
        StringBuilder temp = readSchedule(mother.getSchedule());
        String motherString = mother.getClass().getSimpleName() + "," + mother.getName() + "," + mother.getSurname() + "," + mother.getBirthDate() + "," +
                mother.getIQ() + "," + mother.getMother() + "," + mother.getFather() + "," + mother.getSchedule().toString();
        temp = readSchedule(mother.getSchedule());
        String fatherString = father.getClass().getSimpleName() + "," + father.getName() + "," + father.getSurname() + "," + father.getBirthDate() + "," +
                father.getIQ() + "," + father.getMother() + "," + father.getFather() + "," + father.getSchedule().toString();

        for (Human child : children) {
            sb.append(child.getClass().getSimpleName()).append(",");
            sb.append(child.getName()).append(",");
            sb.append(child.getSurname()).append(",");
            sb.append(child.getBirthDate()).append(",");
            sb.append(child.getIQ()).append(",");
            sb.append(child.getSchedule()).append(",");
            sb.append(";");
        }
        String childrenString = sb.toString();
        sb = new StringBuilder();

        for (Pet pet : pet) {
            sb.append(pet.getClass().getSimpleName()).append(",");
            sb.append(pet.getNickname()).append(",");
            sb.append(pet.getAge()).append(",");
            sb.append(pet.getTrickLevel()).append(",");
            sb.append(pet.getHabits()).append(",");
            sb.append(";");
        }

        String petString = sb.toString();

        FileWriter fw = new FileWriter("families.txt", true);
        fw.write(motherString + "-" + fatherString + "-" + childrenString + "-" + petString + "\n");

        System.out.println("Writing successful");
        fw.close();
    }
}







