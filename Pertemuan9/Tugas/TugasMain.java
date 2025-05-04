package Pertemuan9.Tugas;

public class TugasMain {
  public static void main(String[] args) {
    karyawan kry = new karyawan("Bob", 5500000);
    Manajer mnj = new Manajer("Faiz", 999999999, "Cybersecurity");

    System.out.println("Data Karyawan : ");
    System.out.println(kry.getData());

    System.out.println("\nData Manajer : ");
    System.out.println(mnj.getData());

  }
}
