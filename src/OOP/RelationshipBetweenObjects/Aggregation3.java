package OOP.RelationshipBetweenObjects;

class Book1 {
    String title;
    Book1(String title){
        this.title = title;
    }
}
class Library {
    String libraryName;
    Book1[] books;

    Library(String libraryName, Book1[] books){
        this.libraryName = libraryName;
        this.books = books;
    }
    void display(){
        System.out.println("Library: " + libraryName);

        for (Book1 b : books){
            System.out.println("Book: " + b.title);
        }
    }
}
public class Aggregation3 {
    public static void main(String[] args) {
        Book1 b1 = new Book1("Java");
        Book1 b2 = new Book1("Python");
        Book1 b3 = new Book1("C++");

        Book1[] bookCollection = {b1,b2,b3};

        Library l1 = new Library("Central Library",bookCollection);
        l1.display();

    }
}
