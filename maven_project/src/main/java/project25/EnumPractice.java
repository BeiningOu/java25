package project25;

public class EnumPractice {


    enum Fruit{
        APPLE,
        BANANA,
        BERRY
    }

    public static void main(String[] args) {

        for(Fruit f: Fruit.values()){
            System.out.println(f);
        }
        System.out.println(Fruit.APPLE);


    }


}
