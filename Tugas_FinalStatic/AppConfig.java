package Tugas_FinalStatic;

/**
 * Kelas AppConfig digunakan untuk menyimpan konfigurasi global aplikasi.
 * Semua variabel dideklarasikan dengan modifier `static final` karena nilainya
 * bersifat konstan dan dibagikan secara global (hanya satu salinan di memory).
 */
public class AppConfig {
    public static final String BASE_URL = "https://www.myapp.com/api"; // URL dasar API (konstanta global)
    public static String APP_VERSION = "1.0.0"; // Versi aplikasi saat ini
    public static final int DEFAULT_TIMEOUT = 5000; // Timeout koneksi (dalam ms)
}
