package ca.ciccc.wmad.assignment7.question3;

import java.util.ArrayList;

public class Problem3_1 {
    public static void run(){
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Audi");

        ElementsExchange<String> elements=new ElementsExchange<>(cars);
        System.out.println(elements.getElements());
        elements.exchangeElements(0,2);
        elements.exchangeElements(1,3);

        System.out.println(elements.getElements());
    }
}
