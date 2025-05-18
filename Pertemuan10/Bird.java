package Pertemuan10;

class Bird extends animal implements Flyable {
  @Override
  public void fly() {
    System.out.println("Burung terbang pake sayap");
  }

  @Override
  public void sound() {
    System.out.println("Bunyinya kurrrrr");
  }
}
