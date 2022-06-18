package ca.ciccc.wmad.assignment3.problem6;

import java.util.ArrayList;
import java.util.Scanner;

public class problem6 {
    public static void remomveDuplicated(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        while (number < 100) {
            list.add(number);
            number = input.nextInt();
        }


        System.out.println(firstList(list));
    }
    public static ArrayList<Integer> firstList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(j) == list.get(i)) && (i != j)) {
                    list.remove(j);
                }
            }
        }
        return list;
    }
    }

    private static boolean firstList(ArrayList<Integer> list) {
        return false;
    }
}
