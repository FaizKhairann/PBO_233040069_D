package Tugas_FinalStatic.Soal2;

public class SavingsAccount extends BankAccount {

  public SavingsAccount(String accountNumber, double initialBalance) {
    super(accountNumber, initialBalance);
  }

  // Metode ini tidak dapat di override karena BankAccount.displayAccountInfo()
  // dideklarasikan sebagai final
  // ini akan menghasilkan ERROR kompilasi
  // saat final dihapus dari BankAccount.displayAccountInfo(), maka bisa di
  // override
  // @Override
  // public void displayAccountInfo() {
  // System.out.println("Savings Account info");
  // super.displayAccountInfo();
  // }

  public void showFullInfo() {
    System.out.println("Savings Accoount Info: ");
    // panggil metode final dari superclass
    displayAccountInfo();
    System.out.println("Interest Rate: 3% per year");
  }
}
