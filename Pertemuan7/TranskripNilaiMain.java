package Pertemuan7;

public class TranskripNilaiMain {
  public static void main(String[] args) {
    Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Dr. Muhammad Sumbul");
    Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "B", 3, "Dr. Suki L");
    Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "C", 3, "Ir. Abdul");

    // OBJEK KHS
    KartuHasilStudi khs = new KartuHasilStudi("2023/2024");
    khs.addMatakuliah(mk1);
    khs.addMatakuliah(mk2);
    khs.addMatakuliah(mk3);
    khs.hitungIPS();

    // OBJEK MAHASISWA
    Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

    Semester semester1 = new Semester("Semester 1");
    semester1.addKHS(khs);

    // OBJEK TRANSKRIP NILAI
    Transkripnilai tn = new Transkripnilai(mhs);
    tn.addSemester(semester1);
    tn.hitungIPK();
    tn.display();
  }

}
