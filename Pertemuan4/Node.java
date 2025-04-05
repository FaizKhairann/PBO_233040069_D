package Pertemuan4;

public class Node {
  private int nilai;
  private Node next;

  public Node(int nilai) {
    this.nilai = nilai;
    this.next = null;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public int getnilai() {
    return nilai;
  }

  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    n1.setNext(n2);

    System.out.println("Node 1 nilai: " + n1.getnilai());
    System.out.println("Node 2 nilai: " + n1.getNext().getnilai());
  }
}
