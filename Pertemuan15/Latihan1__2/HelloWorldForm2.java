package Pertemuan15.Latihan1__2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
  private JLabel label;

  // 3
  public HelloWorldForm2() {
    label = new JLabel();
    label.setText("Hello Dunia!");

    add(label);
    setTitle("Program pertama");

    setSize(600, 300);
  }
}
