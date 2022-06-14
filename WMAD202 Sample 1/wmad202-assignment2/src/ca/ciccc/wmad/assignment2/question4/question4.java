package ca.ciccc.wmad.assignment2.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class question4 {
    public void stopInvalid(){
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Only enter a valid number: ");
            try {
                int check = scanner.nextInt();
                numbers.add(check);
            }catch (Exception e){
                int max = Collections.max(numbers);
                int min = Collections.min(numbers);
                int diff = max-min;
                System.out.println("Here is the list of the entered numbers: ");
                System.out.println("Here is the max of the entered numbers: ");
                System.out.println("Here's the min of the entered numbers: ");
                System.out.println("Here's the distance of the entered numbers: ");
                break;
            }
        }
    }
}
