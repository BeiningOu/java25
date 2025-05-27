package project25.dataStructures;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        // array
        String[] stringArray= {"a","b"};
        System.out.println(stringArray.length);
        System.out.println(stringArray);// 这样打印出来是object itself
        System.out.println(Arrays.toString(stringArray));

        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        int[] numbers = new int[5];       // primitive array
        char[] letters = {'a', 'b'};      // primitive array
        String[] stringArray2 = new String[3];          // reference array
        System.out.println(stringArray2[0]); //引用类型数组的元素默认值是 null，
        // 表示没有引用任何对象。
        Integer[] intObjects = new Integer[5];         // reference array
        // MyClass[] myObjects = new MyClass[10];         // reference array
        System.out.println(numbers[0]); //在 Java 中，当你创建一个数组而不赋值时，
        // 每个元素都会自动被初始化为其默认值，这叫做 default initialization。

        // arrayList

        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList);
        stringArrayList.add("b");
        stringArrayList.add("a");
        System.out.println(stringArrayList);

        System.out.println(new ArrayList<>(Arrays.asList("a", "b")));
        System.out.println(new ArrayList<>(Arrays.asList(stringArray)));

        System.out.println(stringArrayList.size()); // length of the array
        stringArrayList.remove(1);

        stringArrayList.add(1,"a1"); // 在位置1插入

        System.out.println(stringArrayList.get(1)); // 输出 orange
        //System.out.println(stringArrayList[2]); cannot do this,
        //can only do this in array, not arrayList

        stringArrayList.set(1,"aw");
        System.out.println(stringArrayList.get(1));
        stringArrayList.remove("aw");
        // 删除元素apple
        //如果找不到 "apple"：
        //ArrayList 会尝试找到第一个值等于 "apple" 的元素。
        //如果找不到，不会报错，方法返回 false，表示没有删除任何元素。

        //如果有多个 "apple"：
        //只会删除第一个出现的 "apple"，不会删掉所有。
        //方法返回 true，表示成功删除了一个。

        //to remove all:

        //while (list.remove("apple")) {
        //    // 每次删一个，直到没有了
        //}



        // sort a ArrayList

        stringArrayList.add("a");
        stringArrayList.add("a1");

        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);


        // List 用List interface 的时候 ：
        // 返回固定大小的 List	快速生成固定元素的列表	不支持 add、remove
        List<String> s1 = Arrays.asList("a","b","c");
        //s1.add("d");// 这样不可以 ..

        List<String> s2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        s2.add("d");  // 这样就可以了
        System.out.println(s2); // 输出: [a, b, c, d]

        s2.forEach(fruit -> System.out.println(fruit)); // forEach with lambda

        s2.forEach(System.out::println);
        // using method reference:
        // 简化 Lambda 表达式，如果 Lambda 中只是调用了某个现成的方法，就可以用方法引用来替代。
        // 类名/对象名::方法名
        // 方法引用 ≈ Lambda 简写，只能用在你要“调用已有方法”的时候，不能带额外逻辑。







    }

}
