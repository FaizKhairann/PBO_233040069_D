package Pertemuan11.Latihan1;

// Kelas Tabung adalah turunan (subclass) dari kelas abstrak Bentuk
public class Tabung extends Bentuk {

  // Atribut tambahan khusus Tabung yaitu 'tinggi'
  private int tinggi;

  // Constructor default: memanggil konstruktor Bentuk dengan nilai jari2 = 0
  public Tabung() {
    super(0);
  }

  // Constructor Tabung dengan parameter jari-jari dan tinggi
  // Nilai jari-jari dikirim ke constructor superclass (Bentuk)
  public Tabung(int jari2, int tinggi) {
    super(jari2); // Set jari-jari dari superclass
    this.tinggi = tinggi; // Set nilai tinggi untuk tabung
  }

  // Override method luas() dari kelas Bentuk
  // Rumus luas permukaan tabung: 2 * PHI * r * (r + t)
  @Override
  public double luas() {
    return 2 * PHI * jari2 * (jari2 + tinggi);
  }

  // SETTER & GETTER

  // Getter untuk atribut tinggi
  public int getTinggi() {
    return tinggi;
  }

  // Setter untuk mengubah nilai tinggi
  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }
}
