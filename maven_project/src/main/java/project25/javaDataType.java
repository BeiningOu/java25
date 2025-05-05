package project25;

public class javaDataType {

    public void referenceDataTypes(){

        // String
        String greeting = "Hi...";

        int strLength = greeting.length();





    }

    public static void main(String[] args) {

    //    primitive data type
    //    Primitive data types
        // - includes byte, short, int, long, float,
        // double, boolean and char
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
