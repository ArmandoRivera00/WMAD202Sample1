package ca.ciccc.wmad.assignment5.problem3;

import java.util.HashMap;

public class problem1 {
    private HashMap<SinglePolynomialFactor, Integer> singlePolynomialFactors;

    public PolynomialFactor() {
        this.singlePolynomialFactors = new HashMap<>();
    }

    public PolynomialFactor(HashMap<SinglePolynomialFactor, Integer> singlePolynomialFactors) {
        this.singlePolynomialFactors = singlePolynomialFactors;

    }
    public void addSinglePolynomialFactor(SinglePolynomialFactor single,int number){
        this.singlePolynomialFactors.put(single,number);

    }

    public String getPolynomialFactor() {
        String allFactor = "";
        for (SinglePolynomialFactor single : this.singlePolynomialFactors.keySet()) {
            allFactor = single + " + " + allFactor;
        }
        return allFactor;
    }
}
