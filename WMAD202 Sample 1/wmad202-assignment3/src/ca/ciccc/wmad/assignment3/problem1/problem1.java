//Design and implement a function which receives a positive integer as it's input parameter and check whether the number
//is a prime number or not. If it's a prime number, the method returns true and if not the method returns false.
package ca.ciccc.wmad.assignment3.problem1;
import java.util.Scanner;

public class problem1 {
    public static boolean searchPrimeNumber(int num){

        if(num <= 1) return false;
        if(num == 2) return true;

        for(int i = 2; i <= num -1; i++ ){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int takeNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        return num;
    }
}
