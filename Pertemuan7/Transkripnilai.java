package Pertemuan7;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Date;
import java.util.*;

public class Transkripnilai {
  private Date tglCetak;
  private double ipk = 0.0;
  private List<Semester> daftarSemester;
  private Mahasiswa mahasiswa;

  public Transkripnilai(Mahasiswa mahasiswa) {
    super();
    this.mahasiswa = mahasiswa;
    this.daftarSemester = new ArrayList<>();
    this.tglCetak = new Date();
  }

  public void hitungIPK() {
    double totalIPS = 0;
    int jumlahSemester = 0;

    for (Semester semester : daftarSemester) {
      for (KartuHasilStudi khs : semester.getDaftarKHS()) { // Mengambil daftar matakuliah dari tiap semester
        totalIPS += khs.getIps();
        jumlahSemester++;
      }
    }
    if (jumlahSemester > 0) {
      this.ipk = totalIPS / jumlahSemester; // Menghitung IPK
    } else {
      this.ipk = 0.0; // Jika tidak ada semester, IPK di-set ke 0.0
    }

  }

  public void addSemester(Semester semester) {
    daftarSemester.add(semester); // Menambahkan semester ke daftar semester
  }

  // public Date getTglCetak() {
  // return tglCetak;
  // }

  // public void setTglCetak(Date tglCetak) {
  // this.tglCetak = tglCetak;
  // }

  // public double getIpk() {
  // return ipk;
  // }

  // public void setIpk(double ipk) {
  // this.ipk = ipk;
  // }

  // public Mahasiswa getMahasiswa() {
  // return mahasiswa;
  // }

  // public void setMahasiswa(Mahasiswa mahasiswa) {
  // this.mahasiswa = mahasiswa;
  // }

  public void display() {
    System.out.println(mahasiswa.display());
    System.out.println("Tanggal Cetak: " + tglCetak.toString());
    System.out.println("IPK: " + ipk);

    for (Semester semester : daftarSemester) {
      System.out.println(semester.display()); // Menampilkan daftar semester
    }
  }
}
