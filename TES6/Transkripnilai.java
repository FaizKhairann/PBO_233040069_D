
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Transkripnilai {
  private Date tglCetak;
  private double ipk = 0.0;
  private List<KartuHasilStudi> kartuHasilStudi;
  private Mahasiswa mahasiswa;

  public Transkripnilai(Mahasiswa mahasiswa) {
    super();
    this.mahasiswa = mahasiswa;
    this.kartuHasilStudi = new ArrayList<>();
    this.tglCetak = new Date();
  }

  public void hitungIPK() {
    double totalNilai = 0;
    int totalSKS = 0;

    for (KartuHasilStudi khs : kartuHasilStudi) {
      for (Matakuliah mk : khs.getDaftarMatakuliah()) { // Mengambil daftar matakuliah dari tiap semester
        totalNilai += mk.nilaiIndex() * mk.getSks(); // Index nilai dikali SKS
        totalSKS += mk.getSks(); // Menjumlahkan total SKS
      }
    }

    this.ipk = (totalSKS == 0) ? 0.0 : totalNilai / totalSKS; // Menghindari pembagian dengan nol
  }

  public void addKHS(KartuHasilStudi khs) {
    kartuHasilStudi.add(khs);
  }

  public void display() {
    System.out.println(mahasiswa.toString());
    System.out.println("Tanggal Cetak: " + tglCetak.toString());
    System.out.println("IPK: " + ipk);
    for (KartuHasilStudi khs : kartuHasilStudi) {
      System.out.println(khs.display());
    }
  }

  public Date getTglCetak() {
    return tglCetak;
  }

  public void setTglCetak(Date tglCetak) {
    this.tglCetak = tglCetak;
  }

  public double getIpk() {
    return ipk;
  }

  public void setIpk(double ipk) {
    this.ipk = ipk;
  }

  public List<KartuHasilStudi> getKartuHasilStudi() {
    return kartuHasilStudi;
  }

  public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
    this.kartuHasilStudi = kartuHasilStudi;
  }

  public Mahasiswa getMahasiswa() {
    return mahasiswa;
  }

  public void setMahasiswa(Mahasiswa mahasiswa) {
    this.mahasiswa = mahasiswa;
  }
}
