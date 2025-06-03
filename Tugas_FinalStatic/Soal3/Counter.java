package Tugas_FinalStatic.Soal3;

public class Counter {
    // Variabel statis untuk menyimpan jumlah instance
    private static int instanceCount = 0;

    // Konstruktor: setiap kali objek dibuat, counter bertambah
    public Counter() {
        instanceCount++;
    }

    // Method static: mengembalikan jumlah total instance yang dibuat.
    public static int getInstanceCount() {
        return instanceCount;
    }
}
