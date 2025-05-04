package Pertemuan9;

public class orang {
  protected String nama;
  protected String alamat;

  // Latihan 2
  // public orang() {
  // nama = "Faiz";
  // alamat = "Cirebon";
  // }

  // Latihan 3
  public orang(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }
}
