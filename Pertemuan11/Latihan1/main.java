package Pertemuan11.Latihan1;

public class main {
  public static void main(String[] args) {
    Lingkaran l = new Lingkaran(10);
    Tabung t = new Tabung(10, 5);

    System.out.println("== Lingkaran ==");
    System.out.println("jari2: " + l.getJari2());
    System.out.println("luas : " + l.luas());

    System.out.println("== Tabung ==");
    System.out.println("jari2 : " + t.getJari2() + ", " + "Tinggi : " + t.getTinggi());
    System.out.println("luas : " + t.luas());
  }
}
