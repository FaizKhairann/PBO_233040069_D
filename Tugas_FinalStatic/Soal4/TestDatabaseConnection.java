package Tugas_FinalStatic.Soal4;

public class TestDatabaseConnection {
  public static void main(String[] args) {

    // Membuat objek DatabaseConnection (tidak perlu karena connectionString static)
    // Namun, untuk menunjukkan bahwa static block dieksekusi, kita buat objeknya
    DatabaseConnection db1 = new DatabaseConnection();
    DatabaseConnection db2 = new DatabaseConnection();

    // Mengakses connectionString akan memicu eksekusi static block
    System.out.println("URL Koneks DB: " + DatabaseConnection.connectionString);
  }

}
