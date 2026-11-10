package OOP.RelationshipBetweenObjects;

class Room {
    void display(){
        System.out.println("This is a room.");
    }
}
class House{
    private Room room;

    House(){
        room = new Room();        // This creates a new Room object and assigns its reference to the room variable.
    }
    void display(){
        System.out.println("This is a house");
        room.display();
    }
}
public class Composition {
    public static void main(String[] args) {

        House h1 = new House ();        //  Creating a house Object
        h1.display();

    }
}
