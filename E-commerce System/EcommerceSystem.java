import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args)throws Exception {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        // Adding default products to store
        store.addProduct(new Product(1, "Laptop", 1200.00, 10));
        store.addProduct(new Product(2, "Smartphone", 800.00, 15));
        store.addProduct(new Product(3, "Headphones", 150.00, 30));

        // Adding default users (admin and customer)
        store.addUser(new User("admin", "admin123", true)); // Admin user
        store.addUser(new User("customer", "cust123", false)); // Regular customer
        store.addUser(new User("", "", false)); // New customer

Thread.sleep(700);
        System.out.println("Welcome to the E-commerce System!");

        // User Login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        User loggedInUser = store.login(username, password);

        if (loggedInUser == null) {
            System.out.println("***************Invalid login credentials.***************");
            
        }

        System.out.println("=====Login successful! Welcome," + username);

        // Main system menu
        while (true) {
            Thread.sleep(200);
            System.out.println("\n1. View Products");
            Thread.sleep(200);
            System.out.println("2. Search Product");
            Thread.sleep(200);
            System.out.println("3. Add to Cart");
            Thread.sleep(200);
            System.out.println("4. View Cart");
            Thread.sleep(200);
            System.out.println("5. Checkout");
            Thread.sleep(200);
            System.out.println("6. Exit");
            Thread.sleep(200);
            System.out.print("Choose an option: ");
            Thread.sleep(200);
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                Thread.sleep(200);
                    // View all products
                    store.viewProducts();
                    break;

                case 2:
                    // Search for a product
                    Thread.sleep(200);
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    Product product = store.searchProduct(productName);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        Thread.sleep(200);
                        
                        System.out.println("*****Product not found.*****");
                    }
                    break;

                case 3:
                Thread.sleep(200);
                    // Add product to cart
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    Product selectedProduct = store.searchProduct(name);
                    if (selectedProduct != null) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        if (quantity <= selectedProduct.getQuantity()) {
                            cart.addProduct(selectedProduct, quantity);
                            System.out.println("*****Product added to cart.*****");
                        } else {
                            System.out.println("*****Insufficient stock.*****");
                        }
                    } else {
                        System.out.println("*****Product not found.*****");
                    }
                    break;

                case 4:
                Thread.sleep(200);
                    // View cart
                    cart.viewCart();
                    break;

                case 5:
                Thread.sleep(200);
                    // Checkout
                    double total = cart.checkout();
                    System.out.println("Checkout successful! Total amount: $" + total);
                    break;

                case 6:
                Thread.sleep(200);
                    // Exit system
                    System.out.println("==================Exiting the system. Thank you for shopping!==================");
                    scanner.close();
                    return;

                default:
                Thread.sleep(400);
                    System.out.println("==================Invalid option. Try again.==================");
            }
        }
    }
}
