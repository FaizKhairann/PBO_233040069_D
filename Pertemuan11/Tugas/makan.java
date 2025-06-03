package Pertemuan11.Tugas;

// Deklarasi interface bernama 'makan'
// Interface adalah kontrak: setiap class yang 'implements makan' harus mengisi method makan()
public interface makan {

  // Method abstrak tidak punya isi, semua class yang mengimplementasikan
  // interface ini wajib menuliskan isi method ini
  void makan();
}
  