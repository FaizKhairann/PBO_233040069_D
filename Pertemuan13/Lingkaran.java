package Pertemuan13;

public    class Lingkaran extends Bentuk {
  private  double radius;
 

  public Lingkaran(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double hitungLuas() {
    return Math.PI * radius * radius;
  }
}
