package Tugas_FinalStatic.Soal5;

public class TestMahasiswa {
  public static void main(String[] args) {
    // Membuat objek-objek mahasiswa
    Mahasiswa m1 = new Mahasiswa("220001", "Ali");
    Mahasiswa m2 = new Mahasiswa("220002", "Budi");
    Mahasiswa m3 = new Mahasiswa("220003", "Citra");

    // Menampilkan data masing-masing mahasiswa
    m1.displayInfo();
    m2.displayInfo();
    m3.displayInfo();

    // Menampilkan total mahasiswa yang sudah dibuat
    System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
  }
}
