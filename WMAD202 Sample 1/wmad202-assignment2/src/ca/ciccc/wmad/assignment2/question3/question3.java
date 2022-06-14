package ca.ciccc.wmad.assignment2.question3;

import java.util.Scanner;

public class question3 {
    public void converttoBinary(){
        System.out.println("Please enter a number: ");
        Scanner decimal = new Scanner(System.in);
        int decimal1=  decimal.nextInt();
        String bin = Integer.toBinaryString(decimal1);
        System.out.println(bin);
    }
}
