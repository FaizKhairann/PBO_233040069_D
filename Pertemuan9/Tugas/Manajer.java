package Pertemuan9.Tugas;

public class Manajer extends karyawan {
  private String divisi;

  public Manajer(String nama, double gaji, String divisi) {
    super(nama, gaji);
    this.divisi = divisi;
  }

  @Override
  public String getData() {
    return super.getData() + "\nDivisi :" + divisi;
  }
}
