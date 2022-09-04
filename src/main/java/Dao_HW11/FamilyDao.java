package Dao_HW11;

import Dao.Gender;
import HappyFamily_HW10.Family;

import java.util.List;
import HappyFamily_HW10.Human;
import HappyFamily_HW10.Pet;

public interface FamilyDao {
     List<Family> getAllFamilies();
     Family getFamilyByIndex(int index);
     void displayAllFamilies();
     boolean deleteFamily(int index);
     boolean deleteFamily(Family family);
     boolean saveFamily(Family family);
     List<Family> getFamiliesBiggerThan(int people);
     List<Family> getFamiliesLessThan(int people);
     List<Family> countFamiliesWithMemberNumber (int people);
     boolean createNewFamily(Human first, Human second);
     boolean deleteFamilyByIndex(int index);
     Family bornChild(Family family, Gender genderEnum);
     Family adoptChild(Family family, Human human);
     boolean deleteAllChildrenOlderThen(int age);
     int count();
     Family getFamilyById(int id);
     List<Pet> getPets(Family family);
     boolean addPet(int index, Pet pet);
}
