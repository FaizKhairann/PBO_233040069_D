package Tugas_FinalStatic.Soal4;

public class DatabaseConnection {
  // Variabel static untuk menyimpan URL koneksi database
  public static String connectionString;

  // static block: dijalankan satu kali ketika kelas pertama kali diload
  static {
    connectionString = "jdbc:mysql://localhost:3306/mydatabase";
    System.out.println("Inisialisasi koneksi database telah dilakukan.");
  }

}
