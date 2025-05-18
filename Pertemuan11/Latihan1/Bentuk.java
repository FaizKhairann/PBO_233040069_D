package Pertemuan11.Latihan1;

// Deklarasi kelas abstrak bernama 'Bentuk'
// Kelas ini tidak bisa langsung diinstansiasi, hanya bisa diturunkan
public abstract class Bentuk {

  // Atribut PHI bertipe double, digunakan untuk perhitungan lingkaran (nilai
  // tetap 3.14)
  protected double PHI = 3.14;

  // Atribut jari2 bertipe integer, bisa diakses oleh subclass karena bersifat
  // protected
  protected int jari2;

  // Constructor untuk menginisialisasi nilai jari-jari
  // 'super()' dipanggil untuk memastikan konstruktor induk dijalankan (meskipun
  // di sini sebenarnya tidak wajib karena tidak ada superclass eksplisit selain
  // Object)
  public Bentuk(int jari2) {
    super(); // Memanggil konstruktor kelas induk (Object)
    this.jari2 = jari2; // Mengisi nilai jari-jari
  }

  // Method abstrak luas(), wajib diimplementasikan oleh subclass
  // Method ini digunakan untuk menghitung luas bentuk (misalnya: lingkaran)
  public abstract double luas();

  // SETTER & GETTER

  // Getter untuk mendapatkan nilai jari2
  public int getJari2() {
    return jari2;
  }

  // Setter untuk mengubah nilai jari2
  public void setJari2(int jari2) {
    this.jari2 = jari2;
  }

}
