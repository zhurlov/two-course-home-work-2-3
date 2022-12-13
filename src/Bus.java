public class Bus extends Transport {


    public Bus(String model, String bodyColor, int maximumMovementSpeed) {
        super(model, bodyColor, maximumMovementSpeed);
    }

    public void refill(){
        System.out.println(" можно заправлять бензином или дизелем на заправке");
    }

    public String toString() {
        return getModel() + " " + getBodyColor() + " " + getMaximumMovementSpeed();
    }
}
