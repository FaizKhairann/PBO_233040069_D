package Pertemuan9;

public class Mahasiswa extends orang {
  // public String nim;
  private String nrp;

  // public Mahasiswa(String nim, String nama, String alamat) {
  // this.nama = nama;
  // this.nim = nim;
  // this.alamat = alamat;
  // }
  // Latihan 2
  // public Mahasiswa() {

  // }

  // Latihan 3
  public Mahasiswa(String nama, String alamat) {
    super(nama, alamat);
  }

  // Latihan 4
  public Mahasiswa(String nrp, String nama, String alamat) {
    super(nama, alamat);
    setNrp(nrp);
  }

  // Latihan 4
  public String getNrp() {
    return nrp;
  }

  public void setNrp(String nrp) {
    this.nrp = nrp;
  }
}
