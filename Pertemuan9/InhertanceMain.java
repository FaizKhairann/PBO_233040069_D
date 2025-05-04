package Pertemuan9;

public class InhertanceMain {
  public static void main(String[] args) {
    // //Latihan 1
    // Mahasiswa mhs = new Mahasiswa("1234", "faiz", "cirebon");
    // System.out.println(mhs.nim);
    // System.out.println(mhs.getNama());
    // System.out.println(mhs.getAlamat());

    // //Latihan 2
    // Mahasiswa mhs2 = new Mahasiswa();
    // System.out.println(mhs2.getNama() + "-" + mhs2.getAlamat());
    // }

    // Latihan 3
    Mahasiswa mhs3 = new Mahasiswa("Faiz", "Cirebon");
    System.out.println(mhs3.getNama() + "-" + mhs3.getAlamat());

    // Latihan 4
    // Mahasiswa mhs4 = new Mahasiswa("1001", "Faiz", "Cirebon");
    // System.out.println(mhs4.getNrp() +
    // "-" + mhs4.getNama() +
    // "-" + mhs4.getAlamat());
  }
}
