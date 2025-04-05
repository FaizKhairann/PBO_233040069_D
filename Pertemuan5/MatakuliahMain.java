package Pertemuan5;

public class MatakuliahMain {
  public void main(String[] args) {
    // CREATE OBJEK MATAKULIAH
    Matakuliah mk1 = new Matakuliah("001", "Pemrograman Berorientasi Objek", "A", 3);
    Matakuliah mk2 = new Matakuliah("002", "Agama", "BC", 3);
    Matakuliah mk3 = new Matakuliah("003", "Matematika Informatika II", "B", 3);

    // TAMPILKAN DAFTAR MATAKULIAH
    System.out.println("----- DAFTAR MATAKULIAH -----");
    System.out.println(mk1.display());
    System.out.println(mk2.display());
    System.out.println(mk3.display());

    System.out.println("----- NILAI IPK -----");
    // BAGAIMANA CARA MENGHITUNG NILAI IPK?
    // RUMUS: (index nilai*sks)+(index nilai*sks)+..+(index nilai*sks)/total sks

  }
}
