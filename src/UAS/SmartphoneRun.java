package UAS;
import java.util.Scanner;

public class SmartphoneRun {
    public static void main(String[] args) {

        //object
        Smartphone smp = new Smartphone("Samsung", "S22", 2022);
        System.out.println("SMARTPHONE VERSUS");
        System.out.println("=======================");
        smp.tampilkan();
        if (smp.getTL() >= 2023) {
            System.out.println("Smartphone ini adalah generasi terbaru.");
        } else {
            System.out.println("Smartphone ini adalah generasi lama");
        }

        System.out.println("=======================");
        //polymorphism (overloading)
        Smartphone smp2 = new Smartphone("Apple", "pro max 12", 2022); 
        smp2.tampilkan();
        if (smp2.getTL() >= 2023) {
            System.out.println("Smartphone ini adalah generasi terbaru.");
        } else {
            System.out.println("Smartphone ini adalah generasi lama");
        }

        //
        SmartphoneGaming smpg = new SmartphoneGaming();
        System.out.println("=======================");
        System.out.println("Smartphone Gaming ");
        smpg.setNB("Asus");
        smpg.setNT("Asus ROG 7");
        smpg.setTL(2023);
        smpg.setCG("YES");
        smpg.setIC("1TB");
        smpg.tampilkan();
        // seleksi if
        if (smpg.getTL() >= 2023) {
            System.out.println("Smartphone ini adalah generasi terbaru.");
        } else {
            System.out.println("Smartphone ini adalah generasi lama");
        }

        
        System.out.println("=======================");
        
        //input sederhana
        Scanner pilihan = new Scanner(System.in);
        String pilih;
        // peruluangan do-while
        do {
            // error handling menggunakan try-catch yang didalam nya terdapat seleksi if
            try {
                System.out.println("Masukkan Pilihan Anda: ");
                pilih = pilihan.nextLine();
                if (pilih.isEmpty()) {
                    throw new IllegalArgumentException("Pilihan tidak boleh kosong.");
                }
               
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                pilih = null; 
            }
        } while (pilih == null);

        //output sederhana
        System.out.println("Pilihan Smartphone Anda Adalah: " + pilih + "!");
    }
    }
