package ca.ciccc.wmad.assignment6.problem1;


import ca.ciccc.wmad.assignment6.problem0.Product;

public class cloth extends Product {
    private ArrayList<Material> clothMaterials;

    public Cloth(int productId, String productName, float productPrice, String productMadeInCountry,ArrayList<Material> clothMaterials) {
        super(productId, productName, productPrice, productMadeInCountry);

        this.clothMaterials=clothMaterials;
    }

}
