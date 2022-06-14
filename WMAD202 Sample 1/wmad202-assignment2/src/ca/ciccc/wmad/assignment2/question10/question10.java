package ca.ciccc.wmad.assignment2.question10;

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = 4;
        Boolean condition = false;

        while(condition == false){
            for(double i = -10; i < number; i++){
                double f1 = Math.pow(2, i);
                double f2 = Math.pow(i, 5);
                if (f1 < f2){
                    continue;
                }else{
                    condition = false;
                    break;
                }
            }
            condition = true;
            if(condition == true){
                for(double i = number; i < number+20; i++){
                    double f1 = Math.pow(2, i);
                    double f2 = Math.pow(i, 5);
                    if (f1 > f2){
                        continue;
                    }else{
                        condition = false;
                        break;
                    }
                }
            }
            number++;
        }
        System.out.println(number);
    }
}
