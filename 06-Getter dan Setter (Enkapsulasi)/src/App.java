class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 17;
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }

    // show 
    void show(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        
        
        Data object = new Data();
        
        // read and write dengan public
        object.intPublic = 10; // public
        System.out.println("Public : " + object.intPublic);

        // read only (menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("hasil getter : " + angka);

        // write only (menggunakan SETTER)
        object.setDoublePrivate(15.7);
        object.show();
    }
}
