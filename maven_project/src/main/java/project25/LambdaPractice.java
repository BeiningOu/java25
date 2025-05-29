package project25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaPractice {

    // (parameters) -> { return body; }
    //参数类型可以省略	(a, b) -> a + b
    //只有一个参数时可以省略括号	x -> x * 2
    //只有一条语句可以省略 {} 和 return	, x -> x + 1
    // 单条语句时，可以省略大括号和 return（如果有返回值则隐式返回该表达式的值）。
    //多条语句时，必须用大括号包裹，且如果有返回值要写 return。


    //function

    //@FunctionalInterface
    //public interface Function<T, R> {
    //    R apply(T t);  // 只能接受一个参数 T，返回一个结果 R
    //}

    //@FunctionalInterface
    //public interface BiFunction<T, U, R> {
    //    R apply(T t, U u);
    //}

    // method reference
    //Classname::method name

    //List using with forEach.
    //numbers.forEach( (n)
    //        ->
    //{ System.out.println(n); } );


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

        // Function interface, combine with lambda, or method reference,
        // using .apply to run it.

        BiFunction<String, String, String> biF0 = (a,b)-> { return a+b;};
        BiFunction<String, String, String> biF1 = (a,b)-> a.concat(b);
        BiFunction<String, String, String> biF2 = String::concat;
        System.out.println(biF0.apply("a", "b"));
        System.out.println(biF1.apply("a", "b"));
        System.out.println(biF2.apply("a", "b"));


    }
}
