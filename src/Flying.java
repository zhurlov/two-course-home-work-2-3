public class Flying extends Birds {
    private String movementType;

    public String getMovementType() {
        Validate.validateString(movementType, "ОШИБКА");
        return movementType;
    }
    public static void fly(){
        System.out.println("парящий");
    }
}
