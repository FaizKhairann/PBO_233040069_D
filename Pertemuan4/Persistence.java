package Pertemuan4;

public class Persistence {
  public void save(Lingkaran obj) {
    System.out.println("Menyimpan objek lingkaran dengan jari-jari " + obj.getJari2());
  }

  public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran(8);
    Persistence presistence = new Persistence();
    presistence.save(lingkaran);
  }
}
