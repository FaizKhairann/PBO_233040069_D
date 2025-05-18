package Pertemuan11.Latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {

  // Atribut kodeBank sebagai identitas bank
  private String kodeBank;

  // Atribut pin untuk menyimpan PIN kartu
  private String pin;

  // Constructor untuk menginisialisasi kodeBank dan pin
  public KartuElektronik(String kodeBank, String pin) {
    super(); // Memanggil konstruktor kelas induk (Object)
    this.kodeBank = kodeBank;
    this.pin = pin;
  }

  // Implementasi method otentikasi dari interface Kartu
  // Membandingkan PIN yang diinput dengan PIN yang tersimpan
  @Override
  public boolean otentikasi(String pinInput) {
    if (pin.equals(pinInput))
      return true; // PIN cocok, otentikasi berhasil
    else
      return false; // PIN tidak cocok, otentikasi gagal
  }

  // Implementasi method encode dari interface Kartu
  // Method ini harus mengembalikan PIN yang sudah dienkripsi
  // Saat ini belum diimplementasikan (mengembalikan null)
  @Override
  public String encode(String pin) {
    // TODO: lakukan enkripsi PIN disini
    return null;
  }
}
