
public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
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

}