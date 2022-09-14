package Dao_Final;

import Dao.FamilyDao;
import Dao.Gender;
import Family.Family;
import Family.Human;
import Family.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService implements FamilyDao {
    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return families.get(index);
    }

    @Override
    public void displayAllFamilies() {
        families.stream().forEach(family -> System.out.println(family.toString()));
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index > families.size()) {
            System.out.println("No index exists in the database");
            return false;
        }
        families.remove(index);
        return true;
    }

    @Override
    public boolean saveFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            return true;
        }
        return false;
    }


    @Override
    public List<Family> getFamiliesBiggerThan(int people) {
        return families.stream().filter(family -> family.countFamily() > people).collect(Collectors.toList());
    }

    @Override
    public List<Family> getFamiliesLessThan(int people) {
        return families.stream().filter(family -> family.countFamily() < people).collect(Collectors.toList());
    }

    @Override
    public List<Family> countFamiliesWithMemberNumber(int people) {
        return families.stream().filter(family -> family.countFamily() == people).collect(Collectors.toList());
    }

    @Override
    public boolean createNewFamily(Human first, Human second) {
        if (first == null || second == null) {
            return false;
        }
        Family newFamily = new Family(first, second);
        families.add(newFamily);
        return true;
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index <= families.size()) {
            families.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Family adoptChild(Family family, Human human) {
        family.addChild(human);
        return family;
    }

    @Override
    public boolean deleteAllChildrenOlderThen(int age) {
//        List<Family> newFamilies = new ArrayList<>();
//        for (Family family : families) {
//            ArrayList<Human> children = family.getChildren();
//            for (Human child : children) {
//                if (child.getAge() > age) {
//                    family.deleteChild(child);
//                }
//            }
//            newFamilies.add(family);
//        }
//        families = newFamilies;
        families.stream().forEach(family -> family.getChildren().stream().filter(child->child.getAge()>age).map(Family::deleteChild).collect(Collectors.toList()));
        System.out.println(families);
        return true;
    }

    @Override
    public int count() {
        return families.size();
    }

    @Override
    public Family getFamilyById(int id) {
        return families.get(id);
    }

    @Override
    public boolean addPet(int index, Pet pet) {
        if (index > families.size()) {
            System.out.println("index is greater than size of families");
            return false;
        }
        Family family = families.remove(index);
        family.addPet(pet);
        families.add(family);
        return true;
    }

    @Override
    public List<Pet> getPets(Family family) {
        return (List<Pet>) family.getPet();
    }

    @Override
    public Family bornChild(Family family, Gender type) {
        families.remove(family);
        boolean keepGoing = true;
        Human child = family.bornChild();
        family.addChild(child);
        families.add(family);
        return family;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }
}
