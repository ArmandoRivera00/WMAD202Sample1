package ca.ciccc.wmad.assignment6.problem1;


import ca.ciccc.wmad.assignment6.problem0.Product;

public class drink extends Product {
    private boolean isDrinkDiet;
    private int drinkSize;


    public Drink(int productId, String productName, float productPrice, String productMadeInCountry,boolean isDrinkDiet,int drinkSize) {
        super(productId, productName, productPrice, productMadeInCountry

        );

        this.isDrinkDiet=isDrinkDiet;
        this.drinkSize=drinkSize;
    }

}
