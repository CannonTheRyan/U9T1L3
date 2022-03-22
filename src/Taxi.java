public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider)
    {
        fareCollected += (getPassengers()-1) * farePerRider;
        return dropOffPassengers(getPassengers()-1);
    }

    public double getFareCollected()
    {
        return fareCollected;
    }

    public void printInfo()
    {
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
    }
//    public void printTaxi()
//    {
//        System.out.println("License Plate: " + getLicensePlate());
//        System.out.println("Toll Fee: " + getTollFee());
//        System.out.println("Number of Passengers: " + getPassengers());
//        System.out.println("Is Electric: " + isElectric());
//        System.out.println("Discount Applied: " + isDiscountApplied());
//        System.out.println("Fare Collected: " + fareCollected);
//    }
}
