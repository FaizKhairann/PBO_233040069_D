
import java.util.List;
import java.util.ArrayList;

public class KartuHasilStudi {
  private String semester;
  private double ips;
  private List<Matakuliah> daftarMatakuliah;

  public KartuHasilStudi(String semester) {
    this.semester = semester;
    this.daftarMatakuliah = new ArrayList<>();
  }

  public void addMatakuliah(Matakuliah matakuliah) {
    daftarMatakuliah.add(matakuliah);
  }

  public String display() {
    StringBuilder sb = new StringBuilder();
    for (Matakuliah matakuliah : daftarMatakuliah) {
      sb.append(matakuliah.display());
      sb.append("\n");
    }
    return sb.toString();
  }

  public void hitungIPS() {
    double totalNilai = 0;
    int totalSKS = 0;
    for (Matakuliah matakuliah : daftarMatakuliah) {
      totalNilai += matakuliah.nilaiIndex() * matakuliah.getSks();
      totalSKS += matakuliah.getSks();
    }
    this.ips = (totalSKS == 0) ? 0.0 : totalNilai / totalSKS;
  }

  public String getSemester() {
    return semester;
  }

  public void setSemester(String semester) {
    this.semester = semester;
  }

  public double getIps() {
    return ips;
  }

  public List<Matakuliah> getDaftarMatakuliah() {
    return daftarMatakuliah;
  }
}
