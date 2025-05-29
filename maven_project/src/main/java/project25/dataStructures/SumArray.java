package project25.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Beining
 * Since: 5/27/25
 * Description: ...
 */
public class SumArray {

    public static void main(String[] args) {
        List<Integer> l0 = new ArrayList<>(Arrays.asList(1,2,3));
        int sum = 0;

        //for each loop, enhanced for loop
        for(int i: l0){
            sum += i;
        }

        // for loop
        int sum2 = 0;
        for(int i = 0; i < l0.size(); i++){
            sum2 += l0.get(i);
        }

        System.out.println(sum2);
    }
}
