package Tugas_FinalStatic.Soal3;

public class TestCounter {
  public static void main(String[] args) {
    // Membuat beberapa objek Counter
    Counter counter1 = new Counter();
    Counter counter2 = new Counter();
    Counter counter3 = new Counter();

    // Menampilkan jumlah total objek Counter yang telah dibuat
    System.out.println("Jumlah objek Counter yang dibuat: " + Counter.getInstanceCount());
  }

}
