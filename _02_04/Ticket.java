package _02_04;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
  public void setPrice(double price) {
    this.price = price;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.
  public double getPrice() {
    return price;
  }

  public String getDestination() {
    return destination;
  }

  public boolean getIsReturn() {
    return isReturn;
  }
}
