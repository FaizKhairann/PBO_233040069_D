
public class Matakuliah {
  private String kode;
  private String nama;
  private String index;
  private int sks;

  // Konstruktor
  public Matakuliah(String kode, String nama, String index, int sks) {
    super();
    this.kode = kode;
    this.nama = nama;
    this.index = index;
    this.sks = sks;
  }

  public double nilaiIndex() {
    if (index.equals("A")) {
      return 4.0;
    } else if (index.equals("AB")) {
      return 3.5;
    } else if (index.equals("B")) {
      return 3.0;
    } else if (index.equals("BC")) {
      return 2.5;
    } else if (index.equals("C")) {
      return 2.0;
    } else if (index.equals("D")) {
      return 1.0;
    } else {
      return 0.0;
    }
  }

  public String display() {
    return "Matakuliah [kode=" + kode + ", nama=" + nama + ", index=" + index + "]";
  }

  public int getSks() {
    return sks;
  }
}
