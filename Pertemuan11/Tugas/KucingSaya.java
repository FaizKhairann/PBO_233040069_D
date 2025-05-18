package Pertemuan11.Tugas;

// Kelas KucingSaya adalah turunan dari Kucing dan mengimplementasikan interface 'makan'
public class KucingSaya extends Kucing implements makan {

  // Constructor KucingSaya memanggil constructor dari superclass Kucing
  public KucingSaya(String nama) {
    super(nama); // Kirim nilai nama ke kelas Kucing dan akhirnya ke Hewan
  }

  // Implementasi method 'makan' dari interface 'makan'
  @Override
  public void makan() {
    System.out.println(nama + " Lagi makan ikan."); // Menampilkan aksi makan
  }
}
