package ca.ciccc.wmad.assignment3.problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class problem9 {
    public static void main(){
        ArrayList<Integer> newList= makeList();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index number.");
        int index = input.nextInt();
        ArrayList<Integer> primeList= primeVisibility(newList,index);
        System.out.printf(" “prime visibility” of the index %d is %d",index,primeList.size());


    }
    public static ArrayList<Integer> primeVisibility(ArrayList<Integer> arrayList, int index ){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 0;i<= index;i++){
            if (Question1.isPrime(arrayList.get(i))){
                primeList.add(arrayList.get(i));

            }
        }
        return primeList;
    }
    public static ArrayList<Integer> makeList() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please enter numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number < 100) {   // Stops when enter greater than 100 and makes list
            list.add(number);
            number = input.nextInt();
        }
        return list;

    }
}
