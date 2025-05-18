package Pertemuan10;

public class main {
  public static void main(String[] args) {
    // 1
    Kucing k = new Kucing();
    k.sound();
    k.eat();

    // 2
    Bird b = new Bird();
    b.fly();
    //extend
    b.sound();

    System.out.println();

    Pesawat p = new Pesawat();
    p.fly();
  }
}
