package Pertemuan13;

public class Tabung extends Lingkaran {
  private double tinggi;


  public Tabung(double radius, double tinggi) {
    super(radius);
    this.tinggi = tinggi;
  }

  @Override
  public double hitungLuas() {
    // luas permukaan tabung: 2πr(r + t)
    return 2 * Math.PI * super.hitungLuas() + 2 * Math.PI * getRadius() * tinggi;
  }
}
