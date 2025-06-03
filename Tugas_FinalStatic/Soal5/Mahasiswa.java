package Tugas_FinalStatic.Soal5;

public class Mahasiswa {
  // NIM tidak boleh berubah setelah diinisialisasi
  private final String nim;

  // Nama bisa diubah
  private String nama;

  // Static counter untuk menghitung jumlah mahasiswa
  private static int totalMahasiswa = 0;

  // Konstanta global: batas maksimum SKS
  public static final int MAX_SKS = 24;

  // Konstruktor
  public Mahasiswa(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
    totalMahasiswa++; // setiap objek yang dibuat, total bertambah
  }

  // Method untuk menampilkan informasi mahasiswa
  public void displayInfo() {
    System.out.println("NIM          : " + nim);
    System.out.println("Nama         : " + nama);
    System.out.println("Maksimum SKS : " + MAX_SKS);
    System.out.println("----------------------------");
  }

  // Method static untuk mendapatkan jumlah mahasiswa yang sudah dibuat
  public static int getTotalMahasiswa() {
    return totalMahasiswa;
  }

}
