package ca.ciccc.wmad.assignment6.problem1;

import java.util.ArrayList;

public class food {
    private int foodCalorie;
    private int foodSize;
    private ArrayList<String> foodIngredients;
    public Food(int productId, String productName, float productPrice, String productMadeInCountry,int foodCalorie,int foodSize,ArrayList<String> foodIngredients) {
        super(productId, productName, productPrice, productMadeInCountry);

        this.foodCalorie=foodCalorie;
        this.foodSize=foodSize;
        this.foodIngredients=foodIngredients;
    }
}
