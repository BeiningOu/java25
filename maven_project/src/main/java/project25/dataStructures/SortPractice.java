package project25.dataStructures;
import javax.swing.*;
import java.util.*;

/**
 * Author: Beining
 * Since: 5/29/25
 * Description: ...
 */
public class SortPractice {

    public static void main(String[] args) {
        String [] stringArray = {"app","abc","def"};
        // 用 Arrays.sort()
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        // [abc, app, def]

        // 如果是对象数组，默认是按对象实现的 Comparable 接口排序（即调用 compareTo() 方法）。

        List<String> stringsArrayList = new ArrayList<>(Arrays.asList("app","abc","def"));
        Collections.sort(stringsArrayList);

        // reverse:
        //stringsArrayList.sort(Comparator.naturalOrder().reversed());

        // Option 2: Sort normally, then reverse
        //You can sort it and then reverse it in-place:
        //Collections.sort(stringsArrayList);           // Ascending (A → Z)
        //Collections.reverse(stringsArrayList);


        //reverse with lambda
      //  stringsArrayList.sort((a, b) -> b.compareTo(a)); // reverse order


        System.out.println(stringsArrayList);
        // [abc, app, def]


        //自定义排序方式：Comparator

        //wrapped array
        List<String> array1 = Arrays.asList("abc", "sdjfhskdfhs", "cde");
        //array1.sort();

        array1.sort((a,b) ->b.length()-a.length()); // lambda
        array1.sort(Comparator.comparingInt(String::length)); // 按字符串长度排序
        System.out.println(array1);



        // comparable
        //class Car implements Comparable {
        //    public String brand;
        //    public String model;
        //    public int year;
        //
        //    // Decide how this object compares to other objects
        //    public int compareTo(Object obj) {
        //        Car other = (Car)obj;
        //        if(year < other.year) return -1; // This object is smaller than the other one
        //        if(year > other.year) return 1;  // This object is larger than the other one
        //        return 0; // Both objects are the same
        //    }
        //}




    }



}
