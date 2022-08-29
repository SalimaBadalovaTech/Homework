package Dao;

import Family.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao {
    static List<Family> families = new ArrayList<>();

    public static List<Family> getFamilies() {
        return families;
    }
}
