package pertemuan_2;

public class orang {
  public String nim;
  public String nama;
  public String alamat;
  public boolean hadir;

  // constructor
  public orang(String nim, String nama, String alamat) {
    this.nim = nim;
    this.nama = nama;
    this.alamat = alamat;
  }

  // method
  public void absen() {
    hadir = true;
  }

}
