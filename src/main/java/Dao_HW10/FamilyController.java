package Dao_HW10;

import Dao.FamilyDao;
import Dao.FamilyService;
import Dao.Gender;
import Family.Family;
import Family.Human;
import Family.Pet;

import java.util.ArrayList;
import java.util.List;

public class FamilyController implements FamilyDao {
    Dao.FamilyService familyService = new FamilyService();

    @Override
    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    @Override
    public void displayAllFamilies() {
        for (Family family : familyService.getAllFamilies()) {
            System.out.println(family.toString());
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index > familyService.count()) {
            System.out.println("No index exists in the database");
            return false;
        }
        familyService.getAllFamilies().remove(index);
        return true;
    }

    @Override
    public boolean saveFamily(Family family) {
        familyService.families.add(family);
        return true;
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int people) {
        List<Family> greatFamilies = new ArrayList<Family>();
        for (Family family : familyService.getAllFamilies()) {
            if (family.countFamily() > people) {
                greatFamilies.add(family);
            }
        }
        return greatFamilies;
    }

    @Override
    public List<Family> getFamiliesLessThan(int people) {
        List<Family> lessFamilies = new ArrayList<Family>();
        for (Family family : familyService.getAllFamilies()) {
            if (family.countFamily() < people) {
                lessFamilies.add(family);
            }
        }
        return lessFamilies;
    }

    @Override
    public List<Family> countFamiliesWithMemberNumber(int people) {
        List<Family> transferred = new ArrayList<Family>();
        for (Family family : familyService.getAllFamilies()) {
            if (family.countFamily() == people) {
                transferred.add(family);
            }
        }
        return transferred;
    }

    @Override
    public boolean createNewFamily(Human first, Human second) {
        if (first == null || second == null) {
            return false;
        }
        Family newFamily = new Family(first, second);
        familyService.getAllFamilies().add(newFamily);
        return true;
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index <= familyService.families.size()) {
            familyService.families.remove(index);
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
        List<Family> newFamilies = new ArrayList<>();
        for (Family family : familyService.families) {
            ArrayList<Human> children = family.getChildren();
            for (Human child : children) {
                if (child.getBirthDate() > age) {
                    family.deleteChild(child);
                }
            }
            newFamilies.add(family);
        }
        familyService.families = newFamilies;
        return true;
    }

    @Override
    public int count() {
        return familyService.count();
    }

    @Override
    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    @Override
    public boolean addPet(int index, Pet pet) {
        if (index > familyService.count()) {
            System.out.println("index is greater than size of families");
            return false;
        }
        Family family = familyService.families.remove(index);
        family.addPet(pet);
        familyService.families.add(family);
        return true;
    }

    @Override
    public List<Pet> getPets(Family family) {
        return (List<Pet>) family.getPet();
    }

    @Override
    public Family bornChild(Family family, Gender type) {
        familyService.families.remove(family);
        boolean keepGoing = true;
        Human child = family.bornChild();
        family.addChild(child);
        familyService.families.add(family);
        return family;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return familyService.families.remove(family);
    }
}
