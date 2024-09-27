import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Member class
class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Member ID: " + memberId;
    }
}

// Library class
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member);
    }

    public void displayMembers() {
        System.out.println("Members of the library:");
        for (Member member : members) {
            System.out.println(member);
        }
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Thread.sleep(1000);
        while (true) {
            Thread.sleep(1000);
            System.out.println("\n***************************************Library Management System***************************************");
            Thread.sleep(600);
            System.out.println("1. Add Book");
            Thread.sleep(600);
            System.out.println("2. Display Books");
            Thread.sleep(600);
            System.out.println("3. Add Member");
            Thread.sleep(600);
            System.out.println("4. Display Members");
            Thread.sleep(600);

            System.out.println("5. Exit");
            Thread.sleep(1200);
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                Thread.sleep(600);
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    Thread.sleep(600);
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Thread.sleep(600);
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author,isbn));
                    break;
                case 2:
                Thread.sleep(600);
                    library.displayBooks();
                    break;
                case 3:
                Thread.sleep(600);
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    Thread.sleep(600);
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    library.addMember(new Member(name,memberId));
                    break;
                case 4:
                Thread.sleep(600);
                    library.displayMembers();
                    break;
                case 5:
                Thread.sleep(600);
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
