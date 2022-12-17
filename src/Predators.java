public class Predators extends Mammals {
    private String typeOfFood;

    public String getTypeOfFood() {
        Validate.validateString(typeOfFood, "ОШИБКА");
        return typeOfFood;
    }
    public static void hunt(){
        System.out.println("преследуют жертву до ее полного изнеможения");
    }
}
