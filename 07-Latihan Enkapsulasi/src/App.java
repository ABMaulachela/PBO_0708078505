class Player{
    
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon; 
    private int level;
    private int incremmentHealth;
    private int incremmentAttack; 


    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incremmentHealth = 20;
        this.incremmentAttack = 20;
    }

    public void levelUp() {
        this.level++;
    }

    public void display(){
        System.out.println("Player\t\t : " + this.name);
        System.out.println("Level \t\t : " + this.level);
        System.out.println("Max Health \t : " + this.maxHealth());
        System.out.println("Attack \t\t : " + this.getAttackPower() + "\n");
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level * this.incremmentHealth + this.armor.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level * this.incremmentAttack + this.weapon.getAttack();
    }
}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}


class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength * 10 + this.health;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Zeus");
        Armor armor1 = new Armor("Baju Besi", 7, 100);
        Weapon weapon1 = new Weapon("Petir", 20);
        
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);


        player1.display();

        Player player2 = new Player("Hercules");
        Armor armor2 = new Armor("Zirah", 3, 100);
        Weapon weapon2 = new Weapon("Pedang", 10);
        
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);


        player2.display();
    }
}
