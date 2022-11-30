class Ling{
    private double diameter;

    public Ling(double diameter){
        this.diameter = diameter;
    }

    //getter jari-jari
    public double getJari2(){
        return this.diameter/2;
    }

     // setter
     public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //get Luas
    public double getLuas(){
        return 3.14*getJari2()*getJari2();
    }

    public double getKeliling() {
        return 2*3.14*getJari2();
    }
}

public class Lingkaran {
    public static void main(String[] args) {
        
        // instansiasi objek baru
        Ling lingkaran = new Ling(5);
        
        //get Jari-jari 
        System.out.println("Jari-jari : " + lingkaran.getJari2());

        //set jari-jari
        lingkaran.setJari2(14);

        System.out.println("Jari-jari Baru : " + lingkaran.getJari2());
        System.out.println("Luas : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());

    } 
}
