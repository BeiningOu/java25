package project25;

import java.util.*;

public class PracticeStringAndArrayList {

    public static String FindIntersection(String[] strArr){

        String[] list1 = strArr[0].split(",\\s*");
        String[] list2 = strArr[1].split(",\\s*");

        Set<String> set1 = new HashSet<>(Arrays.asList(list1));

        List<String> result = new ArrayList<>();

        for(String num: list2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        return String.join(",", result);

    }


    public static void ParacticeArrays(){

        String[] stringarray = {"a", "e"};


        String[] carArray = {"c","b"};
        int[] intAr= {1,3};


        Integer [] intArray = {1,2,3};

        // change element in array.
        stringarray[0] = "s";

        //length of array
        int l = stringarray.length;


        System.out.println("Length of the string array: " + stringarray.length);

        //the length of an array is a field (property),
        // not a method, so you do not use parentheses ().
        // following way is WRONG!!!
       // System.out.println(stringarray.length());



        for(String i : stringarray){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(stringarray));
        System.out.println(Arrays.toString(intArray));

    }

    public static void main(String[] args) {
        String[] input1 = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String[] input2 = {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        String[] input3 = {"2, 5, 6", "1, 3, 4"};

        //System.out.println(FindIntersection(input1)); // Output: 1,4,13
        //System.out.println(FindIntersection(input2)); // Output: 1,9,10
        //System.out.println(FindIntersection(input3)); // Output: false
        //System.out.println("here");
        ParacticeArrays();

    }



}
