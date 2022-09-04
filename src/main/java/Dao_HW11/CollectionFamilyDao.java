package Dao_HW11;

import HappyFamily_HW10.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao {
    static List<Family> families = new ArrayList<>();

    public static List<Family> getFamilies() {
        return families;
    }
}
