package Pertemuan11.Tugas;

// Deklarasi kelas abstrak bernama Hewan
public abstract class Hewan {

  // Atribut 'nama' bertipe String, dilindungi (protected) agar bisa diakses oleh
  // subclass
  protected String nama;

  // Constructor untuk menginisialisasi atribut 'nama'
  public Hewan(String nama) {
    this.nama = nama;
  }

  // Method abstrak suara setiap subclass wajib mengimplementasikan method ini
  public abstract void suara();
}
