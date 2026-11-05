package OOP;

class Book {

    String title;                    ///  Instance variables
    String author;
    int pages;

    Book(String title, String author, int pages) {      /// Constructor 1: Initializes all variables
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author) {             /// Constructor 2: Initializes title and author
        this.title = title;                         // this.title refers to the instance variable of the current object.
        this.author = author;
        this.pages = 0;
    }

    Book() {                                        /// Constructor 3: No parameters
        this.title = "Unknown";
        this.author = "Unknown";
        this.pages = 0;
    }

    public void display() {                         /// Method to display book details
        System.out.println("Title: " + title + " | Author: " + author + " | Pages: " + pages );
    }
}

public class CreatingAClassPractice {

    public static void main(String[] args) {

        // Creating individual objects using different constructors
        Book b1 = new Book("Java Programming", "James", 450);
        Book b2 = new Book("Clean Code", "Robert");
        Book b3 = new Book();

        Book[] books = {b1, b2, b3};      /// Array of Book references

        for (Book b : books) {           /// Enhanced for loop
            b.display();
        }

        books[0].display();              /// Accessing one specific object
    }
}