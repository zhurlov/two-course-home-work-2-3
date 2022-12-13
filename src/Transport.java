public abstract class Transport {

    private String model;
    private String bodyColor;
    private int maximumMovementSpeed;

    public Transport(String model,String bodyColor, int maximumMovementSpeed) {
        this.model = model;
        this.bodyColor = bodyColor;
        //this.maximumMovementSpeed = maximumMovementSpeed;
        if (maximumMovementSpeed == 0 || maximumMovementSpeed <= -1){
            this.maximumMovementSpeed = 60;
        }else {
            this.maximumMovementSpeed = maximumMovementSpeed;

        }
    }

    public abstract void refill();

    public String getModel() {
        if ( model == null || model.isEmpty()){
            this.model = "некорректные данные";
        }
        return model;
    }

    public int getMaximumMovementSpeed() {
        if (maximumMovementSpeed == 0 || maximumMovementSpeed <= -1){
            this.maximumMovementSpeed = 60;
        }

        return maximumMovementSpeed;
    }

//    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
//            this.maximumMovementSpeed = maximumMovementSpeed;
//    }

    public String getBodyColor() {
        if ( bodyColor == null || bodyColor.isEmpty()){
            this.bodyColor = "некорректные данные";
        }

        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String toString() {
        return model + " " + bodyColor + " " + getMaximumMovementSpeed();
    }

}
