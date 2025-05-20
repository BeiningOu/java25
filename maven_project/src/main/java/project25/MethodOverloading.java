package project25;


public class MethodOverloading {

    //with method overload, multiple method can have same name with
    // different parameters

    static int myMethod(int x){
        return x;
    };

    static float myMethod(float x){
      return x;
    };

    static double myMethod(double x, double y){
        return x+y;
    }


    public static void main(String[] args) {

        System.out.println(myMethod(6.00f));

    }
}
