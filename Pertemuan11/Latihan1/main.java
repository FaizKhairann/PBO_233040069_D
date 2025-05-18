package Pertemuan11.Latihan1;

// Kelas main untuk menjalankan program dan menguji kelas Lingkaran dan Tabung
public class main {
  public static void main(String[] args) {
    // Membuat objek Lingkaran dengan jari-jari 10
    Lingkaran l = new Lingkaran(10);

    // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
    Tabung t = new Tabung(10, 5);

    // Menampilkan informasi dan hasil perhitungan luas Lingkaran
    System.out.println("== Lingkaran ==");
    System.out.println("jari2: " + l.getJari2()); // Mengakses nilai jari-jari Lingkaran
    System.out.println("luas : " + l.luas()); // Menghitung dan menampilkan luas Lingkaran

    // Menampilkan informasi dan hasil perhitungan luas Tabung
    System.out.println("== Tabung ==");
    System.out.println("jari2 : " + t.getJari2() + ", " + "Tinggi : " + t.getTinggi()); // Mengakses jari-jari dan
                                                                                        // tinggi Tabung
    System.out.println("luas : " + t.luas()); // Menghitung dan menampilkan luas permukaan Tabung
  }
}
