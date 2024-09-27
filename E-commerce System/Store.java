import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Product> products;
    private ArrayList<User> users;

    public Store() {
        products = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a product to store
    public void addProduct(Product product) {
        products.add(product);
    }

    // View all products
    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Search for a product by name
    public Product searchProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Add user
    public void addUser(User user) {
        users.add(user);
    }

    // User login
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                return user;
            }
        }
        return null;
    }
}
