package UAS;

//class
public class Smartphone {
    //atribut dan encapsulasi
    private String namabrand;
    private String namatipe;
    private int tanggalrelease;

    //constructor
    public Smartphone(String namabrand, String namatipe, int tanggalrelease) {
        this.namabrand = namabrand;
        this.namatipe = namatipe;
        this.tanggalrelease = tanggalrelease;
    }
    
    public Smartphone() {
        
    }

    public void tampilkan() {
        System.out.println("Nama Brand: " + namabrand);
        System.out.println("Nama Tipe: " + namatipe);
        System.out.println("Tanggal Release: " + tanggalrelease);
        
    }

    //mutator (setter)
    public void setNB(String ubahnamabrand) {
        namabrand = ubahnamabrand;
    }
    
    //accessor (getter)
    public String getNB() {
        return namabrand;
    }
    
    public void setNT(String ubahnamatipe) {
        namatipe = ubahnamatipe;
    }
    
    public String getNT() {
        return namatipe;
    }

    public void setTL(int ubahtangalrelease) {
        tanggalrelease = ubahtangalrelease;
    }

    public int getTL() {
        return tanggalrelease;
    }
}
