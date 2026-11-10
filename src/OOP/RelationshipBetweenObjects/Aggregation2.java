package OOP.RelationshipBetweenObjects;

class Player{                         // A player can exist outside a Team.
    String name;
    Player(String name){
        this.name = name;
    }
}
class Team {
    String name;
    Player player1;
    Player player2;

    Team(String name, Player player1, Player player2){
        this.name  = name;
        this.player1 = player1;
        this.player2 = player2;     //  Receives existing Player objects and stores their references inside the Team.
    }
    void display(){
        System.out.println(this.name);
        System.out.println("Player 1: " + player1.name);
        System.out.println("Player 1: " + player2.name);   // Accesses the name field of the Player object through the reference stored in Team.
    }
}
public class Aggregation2 {
    public static void main(String[] args) {

        Player p1 = new Player("Karan Chauhan");      //  Creates Player objects independently of the Team.
        Player p2 = new Player("Rohan Ahuja");

        Team t1 = new Team("Badminton Players", p1, p2);

        t1.display();

    }
}
