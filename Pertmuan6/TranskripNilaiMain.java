package Pertmuan6;

public class TranskripNilaiMain {
  public static void main(String[] args) {
    Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
    Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
    Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

    // OBJEK KHS
    KartuHasilStudi khs = new KartuHasilStudi("20222");
    khs.addMatakuliah(mk1);
    khs.addMatakuliah(mk2);
    khs.addMatakuliah(mk3);

    // OBJEK MAHASISWA
    Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

    // OBJEK TRANSKRIP NILAI
    Transkripnilai tn = new Transkripnilai(mhs);
    tn.addKHS(khs);
    tn.hitungIPK();
    tn.display();
  }
}