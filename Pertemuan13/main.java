package Pertemuan13;

public class main {
  public static void main(String[] args) {
    //// Polymorphism: Referensi Bentuk menunjuk ke objek Lingkaran/Tabung
    Bentuk bentuk1 = new Lingkaran(7);
    Bentuk bentuk2 = new Tabung(7, 10);
    

    System.out.println("Luas Lingkaran : " + bentuk1.hitungLuas());
    System.out.println("Luas Lingkaran : " + bentuk2.hitungLuas());
  }
}
