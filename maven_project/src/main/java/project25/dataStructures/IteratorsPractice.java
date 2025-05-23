package project25.dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsPractice {


    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList<>();

        carList.add("car1");
        carList.add("car2");
        carList.add("car3");

        Iterator<String> carInterator = carList.iterator();

        while (carInterator.hasNext()) {
            System.out.println(carInterator.next());
        }


    }
}
