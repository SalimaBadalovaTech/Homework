package Dao_HW10;

import Dao.Gender;
import Family.Family;

import java.util.List;
import Family.Human;
import Family.Pet;

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
