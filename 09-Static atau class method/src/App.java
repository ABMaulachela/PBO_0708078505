import java.util.ArrayList;

class Player{

    private static int numberOfPlayers;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name){
        this.name = name;
        Player.numberOfPlayers++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player Name : " + this.name);
    }

    // static methods + getter
    static void showNumberOfPlayer(){
        System.out.println("Number of Players : " + Player.numberOfPlayers);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Messi");
        Player player2 = new Player("Ronaldo");
        Player player3 = new Player("Zidane");
        Player player4 = new Player("Mbappe");

        // player1.show();
        // player2.show();
        // player3.show();
        // player4.show();

        Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());
    }
}
