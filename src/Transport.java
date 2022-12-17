public abstract class Transport {

    private String model;
    private String bodyColor;
    private int maximumMovementSpeed;

    public Transport(String model,String bodyColor, int maximumMovementSpeed) {
        this.model = Validate.validateString(model, "некорректные данные");
        this.bodyColor = Validate.validateString(bodyColor, "некорректные данные");
        this.maximumMovementSpeed = Validate.validateInt(maximumMovementSpeed, 60);
    }
    public abstract void refill();

    public String getModel() {
        return model;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String toString() {
        return model + " " + bodyColor + " " + getMaximumMovementSpeed();
    }

}
