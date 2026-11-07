package OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

class ShoppingCrt{
    private ArrayList<String> products = new ArrayList<>();

    public void addProduct(String product){
        products.add(product);
    }
    public void removeProduct(String product){
        products.remove(product);
    }
    public List<String> getProducts(){              /// Getter
        return new ArrayList<>();
    }
    public void display(){
        System.out.println(products);
    }
}
public class test{
    public static void main(String[] args){
        ShoppingCrt s1 = new ShoppingCrt();

        s1.addProduct("Laptop");
        s1.addProduct("Phone");
        s1.addProduct("Tablet");

        s1.display();

        s1.removeProduct("Phone");
        s1.display();

        List<String> items = s1.getProducts();
        items.remove("Laptop");
        s1.display();
    }
}