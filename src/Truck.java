public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate()
  {
    return !hasTrailer ||
            axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX") ||
            axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX");
  }

  @Override
  public double calculateTollPrice()
  {
    if (hasTrailer)
    {
      return 2 * getTollFee() * axles;
    }
    return getTollFee() * axles;
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Number of Axles: " + axles);
    System.out.println("Has Trailer? " + hasTrailer);
  }
//  public void printTruck()
//  {
//    System.out.println("License Plate: " + getLicensePlate());
//    System.out.println("Toll Fee: " + getTollFee());
//    System.out.println("Number of Passengers: " + getPassengers());
//    System.out.println("Number of Axles: " + axles);
//    System.out.println("Has Trailer: " + hasTrailer);
//  }
}