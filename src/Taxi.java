public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric,  double fareCollected){
        super(licensePlate, tollFee, passengers,electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " +getPassengers());
        System.out.println("Electric: " + isElectric());
        System.out.println("Discount Applied: " + isDiscountApplied());
        System.out.println("Fair Collected: $" +fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        int total = getPassengers() + numRiders;
        setPassengers(total);
        fareCollected += numRiders * farePerRider;
        if(getPassengers() >= 4 && !isDiscountApplied()){
            setTollFee(getTollFee() * .50);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected(){
        return fareCollected;
    }


}
