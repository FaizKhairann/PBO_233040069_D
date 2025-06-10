package Tugas_FinalStatic;

public class TestAppConfig {
  public static void main(String[] args) {
    System.out.println("Base URL : " + AppConfig.BASE_URL);
    System.out.println("App Version : " + AppConfig.APP_VERSION);
   // AppConfig.APP_VERSION = "1.0.1"; // Saat final tidak digunakan, berarti nilainya bisa diubah
    System.out.println("Default Timeout : " + AppConfig.DEFAULT_TIMEOUT + " ms");
  }
}
// 