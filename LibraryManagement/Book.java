public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Check if the book is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Mark the book as borrowed
    public void borrowBook() {
        this.isBorrowed = true;
    }

    // Mark the book as returned
    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + (isBorrowed ? " [Borrowed]" : " [Available]");
    }
}
