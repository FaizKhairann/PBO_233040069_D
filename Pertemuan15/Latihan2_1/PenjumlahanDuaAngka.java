package Pertemuan15.Latihan2_1;

import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanDuaAngka extends JFrame implements ActionListener {
  private JTextField textField1, textField2;
  private JButton tombolHitung;

  public PenjumlahanDuaAngka() {
    setTitle("Penjumlahan Dua Angka");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    JLabel label1 = new JLabel("Angka 1:");
    label1.setBounds(20, 20, 100, 25);
    add(label1);

    textField1 = new JTextField();
    textField1.setBounds(120, 20, 100, 25);
    add(textField1);

    JLabel label2 = new JLabel("Angka 2:");
    label2.setBounds(20, 50, 100, 25);
    add(label2);

    textField2 = new JTextField();
    textField2.setBounds(120, 50, 100, 25);
    add(textField2);

    tombolHitung = new JButton("Hitung");
    tombolHitung.setBounds(90, 80, 100, 25);
    tombolHitung.addActionListener(this);
    add(tombolHitung);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      int angka1 = Integer.parseInt(textField1.getText());
      int angka2 = Integer.parseInt(textField2.getText());
      int hasil = angka1 + angka2;

      JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(this, "Input harus berupa angka!");
    }
  }

  public static void main(String[] args) {
    new PenjumlahanDuaAngka();
  }
}
