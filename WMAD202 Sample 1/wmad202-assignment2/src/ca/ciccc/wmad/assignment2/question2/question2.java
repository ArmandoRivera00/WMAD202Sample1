package ca.ciccc.wmad.assignment2.question2;

import java.util.Scanner;

public class question2 {
    public void reverseNumber(){
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        double input1 = input.nextDouble();
        while (input1 % 1 != 0) {
            System.out.println("Please enter a larger number: ");
            input1 = input.nextDouble();
        }
        while (input1 % 10 == 0){
            System.out.println("PLease enter an integer number which isn't divisible by 10:");
            input1 = input.nextDouble();
        }

        double reverse = 0;
        int rem = 0;
        while(input1 != 0)
        {
            rem = (int)input1 % 10;
            reverse = (reverse*10) + rem;
            input1 = (int)input1/10;

        }
        System.out.println("The reverse of the input numbers is: " +(int) reverse);
    }
}
