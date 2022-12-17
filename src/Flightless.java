public class Flightless extends Birds {
    private String movementType;

    public String getMovementType() {
        Validate.validateString(movementType, "ОШИБКА");
        return movementType;
    }
    public static void walk(){
        System.out.println("Нелетающие птицы — птицы, утратившие в процессе эволюции способность к полёту");
    }
}
