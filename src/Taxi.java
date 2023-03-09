public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric,  double fareCollected){
        super(licensePlate, tollFee, passengers,electric);
        this.fareCollected = fareCollected;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Total fair collected: " + fareCollected);
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

    public boolean chargeAndDropOffRiders(double farePerRider){
        int numRiders = getPassengers()-1;
        fareCollected += farePerRider * numRiders;
        return dropOffPassengers(numRiders);
    }

    public void honkHorn(){
        super.honkHorn();
        System.out.println("The meters running!");
    }
}
