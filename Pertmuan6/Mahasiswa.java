package Pertmuan6;

public class Mahasiswa {
  private String NRP;
  private String nama;

  public Mahasiswa() {
    this.NRP = "";
    this.nama = "";
  }

  public Mahasiswa(String nRP, String nama) {
    this.NRP = nRP;
    this.nama = nama;
  }

  // SETTER & GETTER
  public String getNRP() {
    return NRP;
  }

  public void setNRP(String nRP) {
    NRP = nRP;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  @Override
  public String toString() {
    return "Mahasiswa [NRP=" + NRP + ", nama=" + nama + "]";
  }

}
