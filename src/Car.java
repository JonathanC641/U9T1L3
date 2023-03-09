public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Electric? " + electric);
        System.out.println("Discount applied? " + discountApplied);
    }


    public boolean isElectric(){
        return electric;
    }

    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public void setDiscountApplied(boolean check){
        discountApplied = check;
    }

    public boolean dropOffPassengers(int numOut){
        if(numOut >= getPassengers()){
            return false;
        }
        int in = getPassengers() - numOut;
        setPassengers(in);
        return true;
    }

    public void applyDiscount(){
        if(electric && !discountApplied){
            double half = getTollFee() * .50;
            setTollFee(half);
            discountApplied = true;
        }
    }

    public double calculateTollPrice() {
        if(getPassengers() > 4){
            return getTollFee() * 4;
        }else {
            return super.calculateTollPrice();
        }
    }
}