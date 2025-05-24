package project25.advance;

public class exceptionsPractice {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};

        try {
            System.out.println(intArray[7]);
        } catch (Exception e) {
            System.out.println("there is an error");
        } finally {
            System.out.println("this is the end of try-catch block");
        }

        //finally statement lets you execute code,
        // after try...catch, regardless of the result

        if (intArray.length >= 5) {
            throw new ArithmeticException("The length is >=5");

        } else {
            System.out.println("length <5");
        }


    }
}
