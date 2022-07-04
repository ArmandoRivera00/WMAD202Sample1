package ca.ciccc.wmad.assignment5.problem2.computer;
import ca.ciccc.wmad.assignment5.problem2.product.product;
import java.util.ArrayList;
import java.util.HashMap;
public class computer {
    private String user;
    private HashMap<Computer_Program,String> users;

    public Computer(String user){
        this.user=user;
        this.users=new HashMap<>();

    }
    public void getComputerInfo(){
        for(Computer_Program c: this.users.keySet()){
            System.out.println(c.getCodes() + ": "+ c);
        }
    }


}
