package project25.dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashmapPractice {

    public static void main(String[] args) {
        HashMap<String,String> checkup = new HashMap<String, String>();

        // hashmap: put(): add elements
        // remove(): delete element
        // remove all element: checkup.clear();
        // size: checkup.size() // return the size

        checkup.put("A","a");
        checkup.put("B", "b");
        checkup.put("C","c");
        checkup.put("D", "d");
        checkup.remove("D");

        System.out.println(checkup);

        // hashset: .add(); .remove(); .clear();  .size();

        HashSet<String> set_car = new HashSet<>();
        //HashSet<String> set_car = new HashSet<String>(); recommended first one
        //not this one

        //
        set_car.add("Ford");
        set_car.add("Ford1");
        set_car.add("Ford2");

        System.out.println(set_car);

        // From array to hashSet
        HashSet<String> set_car2 = new HashSet<>(Arrays.asList("F1", "F2"));
        System.out.println(set_car2);

        System.out.println(set_car2.contains("F1")); // return true





    }

}
