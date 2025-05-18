package Pertemuan11.Tugas;

// Kelas utama untuk menjalankan program
public class Main {
  public static void main(String[] args) {
    // Membuat objek dari kelas KucingSaya dengan nama "Bob"
    KucingSaya kucing = new KucingSaya("Bob");

    // Memanggil method 'suara()' dari class Kucing (warisan dari Hewan)
    kucing.suara(); // Output: Bob: nyamnyam!!

    // Memanggil method 'makan()' dari interface Makan yang diimplementasikan di
    // KucingSaya
    kucing.makan(); // Output: Bob Lagi makan ikan.
  }
}
