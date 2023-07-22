# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi komparasi gawai ponsel pintar dengan berisi input pilihan akhir dari user menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input pilihan gawai ponsel pinter user, dan memberikan output berupa pilihan gawai ponsel pinter user yang telah diketik user.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Smartphone`, `SmartphoneGaming`, dan `SmartphoneRun` adalah contoh dari class.

```bash
public class Smartphone {
    ...
}

public class SmartphoneGaming extends Smartphone {
    ...
}

public class SmartphoneRun {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Smartphone smp = new Smartphone("Samsung", "S22", 2022);` adalah contoh pembuatan object.

```bash
Smartphone smp = new Smartphone("Samsung", "S22", 2022);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namabrand`, `namatipe`  dan `tanggalrelease` adalah contoh atribut.

```bash
String namabrand;
String namatipe;
int tanggalrelease;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Smartphone` 

```bash
public Smartphone(String namabrand, String namatipe, int tanggalrelease) {
    this.namabrand = namabrand;
    this.namatipe = namatipe;
    this.tanggalrelease = tanggalrelease;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNB` dan `setNT` adalah contoh method mutator.

```bash
public void setNB(String ubahnamabrand) {
    namabrand = ubahnamabrand;
}

public void setNT(String ubahnamatipe) {
    namatipe = ubahnamatipe;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNB`, `getNT`, `getTL`, `getCG`, `getIC` adalah contoh method accessor.

```bash
public String getNB() {
    return namabrand;
}

public String getNT() {
    return namatipe;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namabrand` dan `tanggalrelease` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namabrand;
private int tanggalrelease;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SmartphoneGaming` mewarisi `Smartphone` dengan sintaks `extends`.

```bash
public class SmartphoneGaming extends Smartphone {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Smartphone smp2 = new Smartphone("Apple", "pro max 12", 2022); || smp2.tampilkan();` di `SmartphoneRun` merupakan overloading method `tampilkan` dan `tampilkan` di `SmartphoneGaming` merupakan override dari method `tampilkan` di `Smartphone`.

```bash
Smartphone smp2 = new Smartphone("Apple", "pro max 12", 2022); 
    smp2.tampilkan();
}

@Override
public void tampilkan() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam parameter atribut object dari  Smartphone smp2 = new Smartphone.

```bash
Smartphone smp2 = new Smartphone("Apple", "pro max 12", 2022); 
        smp2.tampilkan();
        if (smp2.getTL() >= 2023) {
            System.out.println("Smartphone ini adalah generasi terbaru.");
        } else {
            System.out.println("Smartphone ini adalah generasi lama");
        }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `do-while` untuk meminta input yang harus sesuai untuk  ditampilkan kembali.

```bash
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
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner pilihan = new Scanner(System.in);
String pilih;
System.out.println("Masukkan Pilihan Anda: ");
pilih = pilihan.nextLine();

System.out.println("Pilihan Smartphone Anda Adalah: " + pilih + "!");
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` yang berada dalam perulangan do-while untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |    -    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **85**  |

## Pembuat

Nama: Rizqi Akbar
NPM: 2110010182
