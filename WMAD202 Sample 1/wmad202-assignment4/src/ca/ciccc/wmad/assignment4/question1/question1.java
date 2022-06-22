// Write a method which has no input parameter. The method asks the user to enter numbers. The user can enter repeated
// numbers but if the users entered a number which was already entered, the method will provide an error message
// to the user and ask the user to enter another one. The user can enter numbers as long as s/he has not entered 0.
// Once a 0 is entered, the method returns the sum of all distinct numbers the user had entered.
package ca.ciccc.wmad.assignment4.question1;

import java.util.HashMap;
import java.util.Scanner;

public class question1 {
    public static void test(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        HashMap<Integer,Integer> numbers= new HashMap<>();
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        while(number!=0){
            if(numbers.containsKey(number)){
                System.out.println("You have entered this number. ");
                System.out.println("Please enter a different number: ");
                number = input.nextInt();
            }
            else{
                numbers.put(number,1);
                System.out.println("Please enter a new number: ");
                number = input.nextInt();
            }

        }

        for(Integer i : numbers.keySet()){
            sum = sum + i;
        }
        System.out.println("The sum of numbers is " + sum);



    }

}
