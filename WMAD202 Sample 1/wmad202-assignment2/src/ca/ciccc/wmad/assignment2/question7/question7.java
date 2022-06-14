package ca.ciccc.wmad.assignment2.question7;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = myObj.nextInt();

        double output = Math.pow((number * Math.sqrt(2))/2 , 2) * 3.14159;
        System.out.println("Enter the statement:" + output);
}
