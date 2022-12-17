public class Mammals extends Animals {
    private String habitat;
    private int travelSpeed;

    final String getHabitat() {
        Validate.validateString(habitat, "ОШИБКА");
        return habitat;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        Validate.validateInt(travelSpeed, 0);
        this.travelSpeed = travelSpeed;
    }

    public static void walk(){

    }

    @Override
    public void sleep() {
    }

    @Override
    public void move() {
    }

    @Override
    public void eat(){
        System.out.println("употребляют растительную пищу");
    }
}
