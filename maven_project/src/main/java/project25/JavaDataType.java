package project25;

public class JavaDataType {

    public static void dataTypes(){

        // String
        String greeting = "Hi....";
        String s = "hello";

        // string.length()

        int strLength = greeting.length();

        //2. charAt(int index)
        //Returns the character at the specified index.
        System.out.println(greeting.charAt(5));







    }

    public static void main(String[] args) {

    //    primitive data type
    //    Primitive data types
        // - includes byte, short, int, long, float,
        // double, boolean and char

        dataTypes();

        int num = 3;
        float floatNum = 3.0f;
        char letterChar = 'f';
        boolean isBlack = true;
        long myNum = 15000000000L;

        // data casting (auto casting: small -> large)
        // Widening Casting (automatically)
        float numToFloat = num;
        System.out.println(numToFloat);


        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        int floatToInt = (int) floatNum;

        System.out.println(floatToInt);



        String color = "blue";

    }
}
