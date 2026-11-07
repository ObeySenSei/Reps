package OOP.Encapsulation;
import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    private ArrayList<String> products = new ArrayList<>();      /// Instance Variable

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public List<String> getProducts() {                  /// Method to access the contents inside that variable
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

        List<String> items = cart.getProducts();    /// Getting a copy of the original list

        items.add("Phone");         /// Modifying the returned copy

        System.out.println("\nReturned List after modification:");
        System.out.println(items);

        System.out.println("\nOriginal cart after external modification:");       /// Displaying original cart again
        cart.displayCart();
    }
}