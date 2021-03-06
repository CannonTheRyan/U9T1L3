public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean dropOffPassengers(int numOut)
  {
    if (numOut >= getPassengers())
    {
      return false;
    }
    else
    {
      setPassengers(getPassengers() - numOut);
      return true;
    }
  }

  public void applyDiscount()
  {
    if (!discountApplied)
    {
      if (electric)
      {
        setTollFee(.5 * getTollFee());
        discountApplied = true;
      }
    }
  }

  @Override
  public double calculateTollPrice()
  {
    if (getPassengers() > 4)
    {
      return getTollFee() * 4;
    }
    return super.calculateTollPrice();
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Electric? " + electric);
    System.out.println("Discount Applied? " + discountApplied);
  }
//  public void printCar()
//  {
//    System.out.println("License Plate: " + getLicensePlate());
//    System.out.println("Toll Fee: " + getTollFee());
//    System.out.println("Number of Passengers: " + getPassengers());
//    System.out.println("Is Electric: " + electric);
//    System.out.println("Discount Applied: " + discountApplied);
//  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }
}