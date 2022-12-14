public class App {
    public static void main(String[] args) throws Exception {
        // overloading pada contructor
        Player player1 = new Player("Saitama");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Messi");

        player1.display();
        player2.display();
        player3.display();
        player4.display();

        // overloading
        int a = Matematika.tambah(12, 13);
        System.out.println(a);
        double b = Matematika.tambah(12, 13.3);
        System.out.println(b);
    }
}
