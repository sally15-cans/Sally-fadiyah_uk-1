class Hewan {

    private String jenis;
    private int umur;

    
    public Hewan(String jenis, int umur) {
        this.jenis = jenis;
        this.umur = umur;
    }


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    
    public void suara() {
        System.out.println("Hewan ini bersuara.");
    }
}


class Mamalia extends Hewan {
    
    public Mamalia(String jenis, int umur) {
        super(jenis, umur);
    }

    
    public void ciriMamalia() {
        System.out.println("Mamalia menyusui.");
    }


    public String lari() {
        return "Mamalia berlari.";
    }

    public String lari(int kecepatan) {
        return "Mamalia berlari dengan kecepatan " + kecepatan + " km/jam.";
    }
}


class Kucing extends Mamalia {

    
    public Kucing(String jenis, int umur) {
        super(jenis, umur);
    }

    
    @Override
    public void suara() {
        System.out.println("Kucing meong!");
    }

    
    @Override
    public String lari() {
        return "Kucing berlari dengan lincah.";
    }
}


class Anjing extends Mamalia {

    
    public Anjing(String jenis, int umur) {
        super(jenis, umur);
    }

    
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong!");
    }
}

public class MainClass {
    public static void main(String[] args) {
        
        Kucing kucing = new Kucing("Persia", 2);
        Anjing anjing = new Anjing("Golden Retriever", 3);
        
        
        Hewan hewan1 = kucing;
        Hewan hewan2 = anjing;

        
        hewan1.suara();
        hewan2.suara();

        
        System.out.println("Jenis Kucing: " + kucing.getJenis());
        System.out.println("Umur Kucing: " + kucing.getUmur());
        kucing.setUmur(3); 
        System.out.println("Umur Kucing setelah diubah: " + kucing.getUmur());
        
    
        System.out.println("Lari Kucing: " + kucing.lari());
        System.out.println("Lari Kucing dengan kecepatan: " + kucing.lari(15));
    }
}