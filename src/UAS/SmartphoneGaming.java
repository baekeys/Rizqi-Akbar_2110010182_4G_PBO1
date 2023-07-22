package UAS;

//inheritance
public class SmartphoneGaming extends Smartphone {
    private String charging;
    private String icloud;

    public void setCG(String tambahfitur) {
        charging = tambahfitur;
    }

    public String getCG() {
        return charging;
    }

    public void setIC(String kapasitasic) {
        icloud = kapasitasic;
    }

    public String getIC() {
        return icloud;
    }
    
@Override
    //polymorphism (override)
    public void tampilkan() {
        System.out.println("Nama Brand: " + getNB());
        System.out.println("Nama Tipe: " + getNT());
        System.out.println("Tanggal Release: " + getTL());
        System.out.println("Fitur Fast Charging: " + getCG());
        System.out.println("Kapasitas ICloud: " + getIC());
    }
}