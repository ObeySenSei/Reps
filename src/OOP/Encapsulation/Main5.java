package OOP.Encapsulation;
import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    private ArrayList<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public List<String> getProducts() {
        return new ArrayList<>(products);
    }

    public void displayCart() {
        System.out.println(products);
    }
}

public class Main5 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop");
        cart.addProduct("Mouse");
        cart.addProduct("Keyboard");

        cart.displayCart();

        cart.removeProduct("Mouse");

        cart.displayCart();

        // Try modifying the returned list
        List<String> items = cart.getProducts();
        items.add("Mobile");

        cart.displayCart();
    }
}