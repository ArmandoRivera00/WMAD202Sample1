package ca.ciccc.wmad.assignment2.question6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;.java.util.Scanner;
public class question6 {
    public void statement(){
        boolean stopAsking = true;
        List<Character> numbers = new ArrayList<>();
        while (stopAsking) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Please enter a statement: ");
            String input = scanner.nextLine();

            for(int i=0; i<input.length();i++) {
                if(!Character.isLetter(input.charAt(i))) {
                    if((input.charAt(i) == '(') || (input.charAt(i) == ')') || (input.charAt(i) == '+') || (input.charAt(i) == '*') ||
                            (input.charAt(i) == '%') || (input.charAt(i) == '-')){
                        numbers.add(input.charAt(i));
                        stopAsking=true;
                    }
                    else {
                        stopAsking=false;
                    }
                }
                numbers.add(input.charAt(i));
            }

        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
                }
            }
        }
    }
}
