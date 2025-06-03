package Tugas_FinalStatic.Soal2;

public class BankAccount {
  private final String accountNumber; // final: nilainya tidak dapat diubah setelah konstruktor
  protected double balance; // protected: bisa diakses oleh subclass

  // KONSTRUKTOR
  public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber; // Nilai hanya dapat di-set sekali di konstruktor
    this.balance = initialBalance;
  }

  // METHOD
  public final void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: $ " + balance);
  }
}
