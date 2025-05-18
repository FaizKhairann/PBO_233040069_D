package Pertemuan11.Latihan2;

// Interface Kartu, sebagai kontrak yang harus diimplementasikan oleh kelas yang menggunakan interface ini
public interface Kartu {

  // Method otentikasi: menerima input PIN dan mengembalikan nilai boolean
  // true jika otentikasi berhasil, false jika gagal
  public boolean otentikasi(String pin);

  // Method encode: menerima input PIN dan mengembalikan versi terenkripsi atau
  // terformat dari PIN tersebut
  public String encode(String pin);
}
