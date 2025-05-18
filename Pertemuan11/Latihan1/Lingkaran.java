package Pertemuan11.Latihan1;

// Kelas Lingkaran adalah turunan dari kelas abstrak 'Bentuk'
// Artinya, Lingkaran wajib mengimplementasikan method abstrak yang ada di 'Bentuk'
public class Lingkaran extends Bentuk {

  // Constructor Lingkaran menerima parameter jari-jari dan meneruskannya ke
  // konstruktor superclass (Bentuk)
  public Lingkaran(int jari2) {
    super(jari2); // Memanggil konstruktor di kelas Bentuk untuk menginisialisasi nilai jari2
  }

  // Implementasi method abstrak 'luas' dari kelas Bentuk
  // Menghitung luas lingkaran menggunakan rumus: π * r^2
  @Override
  public double luas() {
    return PHI * jari2 * jari2; // PHI diwarisi dari kelas Bentuk
  }

}
