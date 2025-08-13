package Arrays.Fundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FreqCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        fcLoops(numbers); // using loops
        fcLists(); // using lists only
    }
    static void fcLoops(int[] numbers) {
        int count = 0, target = 2;
        for(int num: numbers) {
            if(num == target) count++;
        }
        System.out.println(count + " count");
    }
    static void fcLists() {
//        int listCount or int listCount = 0
        int listCount, target = 2;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5);
        listCount = Collections.frequency(numbers,target);
        System.out.println(listCount + " listCount");
    }
}
