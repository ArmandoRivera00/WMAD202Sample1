package ca.ciccc.wmad.assignment7.question5;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class testquestion {
    public static void run() {
        ArrayList<Integer> relativelyPrimes = new ArrayList<>();
        relativelyPrimes.add(23);
        relativelyPrimes.add(25);
        UnaryOperator<Integer> p = num -> num ;
        System.out.println(RelativelyPrimeCheck.findFirst(relativelyPrimes, 0, 1, p));
    }
}