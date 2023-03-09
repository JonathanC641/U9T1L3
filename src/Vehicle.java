
public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }
    public void printInfo(){
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }


    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public double getTollFee(){
        return tollFee;
    }

    public void setTollFee(double num){
        tollFee = num;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int num){
        passengers =num;
    }

    public void honkHorn(){
        System.out.println("BEEEP");
        System.out.println("Get outta the way!");
    }

}