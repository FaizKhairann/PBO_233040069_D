package Pertemuan9.Tugas;

public class karyawan {
  protected String nama;
  protected double gaji;

  public karyawan(String nama, double gaji) {
    this.nama = nama;
    this.gaji = gaji;
  }

  public String getData() {
    return "Nama : " + nama + "\nGaji: Rp" + gaji;
  }

}
