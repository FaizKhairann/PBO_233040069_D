package pertemuan_2;

public class ball {
  private String color;
  public int size;
  public Boolean movestatus;

  // constructor
  public ball(String color, int size, boolean movestatus) {
    this.color = color;
    this.size = size;
    this.movestatus = movestatus;
  }

  // method
  public void move() {
    movestatus = true;
    System.out.println("The Ball is Moving");
  }

  public void stop() {
    movestatus = false;
    System.out.println("The Ball is Stopped");
  }

  public void showStatus() {
    String status = movestatus ? "moving" : "not moving";
    System.out.println("The Ball is currently" + status + ".");

    // String status;
    // if (movestatus) {
    // status = "moving";
    // }
    // else (movestatus) {
    // status = "not moving";
    // }
  }

  public void showColor() {
  }

  public static void showSize() {
  }

}
