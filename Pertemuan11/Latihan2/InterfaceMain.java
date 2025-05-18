package Pertemuan11.Latihan2;

// Kelas main untuk menjalankan program dan menguji kelas KartuElektronik
public class InterfaceMain {
  public static void main(String[] args) {
    // Membuat objek KartuElektronik dengan parameter id dan pin
    KartuElektronik kartu = new KartuElektronik("IF111", "123");

    // Memanggil method otentikasi dengan input "123" dan menampilkan hasilnya ke
    // console
    System.out.println("Otentikasi :" + kartu.otentikasi("123"));
  }
}
