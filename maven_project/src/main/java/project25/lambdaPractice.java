package project25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class lambdaPractice {



    public static void main(String[] args) {

        // using lambda
        Function<String, Integer> stringLength = s -> s.length();

        // using method reference:
        Function<String, Integer> stringLengthMethodReference = String::length;

        Integer length = stringLength.apply("Hello");
        System.out.println(stringLength.apply("apples"));
        System.out.println(stringLengthMethodReference.apply("bananas"));



        //boxing
        int num = 5;
        List<Integer> numbers = new ArrayList<>();

        numbers.add(num);
        numbers.add(num);

        System.out.println(numbers);

    }
}
