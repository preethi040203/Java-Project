import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args)throws Exception {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Thread.sleep(1200);
            System.out.println("\n====================== Library Management System======================");
            Thread.sleep(400);
            System.out.println("1. Add Book");
            Thread.sleep(400);
            System.out.println("2. View Books");
            Thread.sleep(400);
            System.out.println("3. Borrow Book");
            Thread.sleep(400);
            System.out.println("4. Return Book");
            Thread.sleep(400);
            System.out.println("5. Exit");
            Thread.sleep(600);
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                Thread.sleep(300);
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    Thread.sleep(300);
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Thread.sleep(300);
                    library.addBook(new Book(title, author));
                    break;
                case 2:
                Thread.sleep(300);

                    // View all books
                    library.viewBooks();
                    break;
                case 3:
                    // Borrow a book
                    Thread.sleep(300);
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    // Return a book
                    Thread.sleep(300);
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                Thread.sleep(300);
                    // Exit the system
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                Thread.sleep(300);
                    System.out.println("*****************Invalid option. Please choose again.*****************");
            }
        }
    }
}
