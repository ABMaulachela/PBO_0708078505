class Display{
    private String name;
    static String type = "Layar";

    Display(String name) {
        this.name = name;
    }

    void setType(String type) {
        // cara 1
        //this.type = type;
        // cara 2
        Display.type = type;
        
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        
        Display tampil1 = new Display("Monitor");
        tampil1.show();

        Display tampil2 = new Display("Smartphone");
        tampil2.show();

        // menampilkan static variable atau class variabel
        System.out.println("\nMenampilkan static variabel");
        System.out.println(tampil1.type);
        System.out.println(tampil2.type);
        System.out.println(Display.type);

        // mencoba mengganti isi dari variable static
        Display.type = "LCD";
        System.out.println("\nMenampilkan static variabel");
        System.out.println(tampil1.type);
        System.out.println(tampil2.type);
        System.out.println(Display.type);

        // mengganti isi variable static dengan method setter
        tampil1.setType("LED");
        System.out.println("\nMenampilkan static variabel");
        System.out.println(tampil1.type);
        System.out.println(tampil2.type);
        System.out.println(Display.type);

    }
}
