// Design and implement a method which has one input parameter which is a number which is greater than 50, called num.
// Then the method will create a dictionary whose keys are 2 and 3 and 4 and 5 and 6 and 7 and 8 and 9. Then the method
// calculates the values for each of the above keys. The value for a key is all the numbers between 2 and input "num"
// that are divisible by the key. The method eventually will print the result.
package ca.ciccc.wmad.assignment4.question3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class question3 {
    public static void test(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        HashSet<Integer> two = new HashSet<>();
        HashSet<Integer> three = new HashSet<>();
        HashSet<Integer> four = new HashSet<>();
        HashSet<Integer> five = new HashSet<>();
        HashSet<Integer> six = new HashSet<>();
        HashSet<Integer> seven = new HashSet<>();
        HashSet<Integer> eight = new HashSet<>();
        HashSet<Integer> nine = new HashSet<>();
        for(int i = 2;i<=number;i++){
            if(i%2==0){
                two.add(i);
            }
            if(i%3==0){
                three.add(i);
            }
            if(i%4==0){
                four.add(i);
            }
            if(i%5==0){
                five.add(i);
            }
            if(i%6==0){
                six.add(i);
            }
            if(i%7==0){
                seven.add(i);
            }
            if(i%8==0){
                eight.add(i);
            }
            if(i%9==0){
                nine.add(i);
            }
        }
        map.put(2,two);
        map.put(3,three);
        map.put(4,four);
        map.put(5,five);
        map.put(6,six);
        map.put(7,seven);
        map.put(8,eight);
        map.put(9,nine);
        System.out.println(map);



    }


}
