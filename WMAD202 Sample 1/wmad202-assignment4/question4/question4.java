// Write a method which receives a list and returns a number. In the list, all numbers have been repeated twice except
// one number that is repeated once. The method should return the number that is repeated once and return it.
package ca.ciccc.wmad.assignment4.question4;

import java.util.HashMap;

public class question4 {
    public static void test() {
        int[] array = {1, 1, 2, 2, 3, 3, 4,4,5, 6, 6, 7, 7, 8, 8, 9, 9};
        findSingle(array);

    }

    public static void findSingle(int[] list) {
        HashMap<Integer,Integer> numbers = new HashMap<>();

        for (Integer i : list) {
            if (numbers.containsKey(i)) {
                numbers.remove(i);
            } else {
                numbers.put(i,1);
            }
        }

        System.out.println(numbers.keySet());
    }

}
}
