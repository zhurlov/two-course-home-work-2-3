public class Mammals extends Animals {
    private String habitat;
    private int travelSpeed;


    final String getHabitat() {
        return habitat;
    }


    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public static void walk(){

    }


    @Override
    public void eat(){
        System.out.println("употребляют растительную пищу");

    }
}
