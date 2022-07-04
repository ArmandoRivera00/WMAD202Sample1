package ca.ciccc.wmad.assignment5.problem2.product;

public class product {
    private String name;
    private float price;

    public Product(String name,float price){
        this.name=name;
        this.price=price;
    }
    public float getPrice(){
        return this.price;
    }
}
