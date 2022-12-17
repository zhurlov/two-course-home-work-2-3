public class Amphibians extends Animals {
    private String habitat;

    final String getHabitat() {
        Validate.validateString(habitat, "ОШИБКА");
        return habitat;
    }
    public static void hunt(){
        System.out.println("выбрасывая изо рта длинный липкий язык");
    }

    @Override
    public void sleep() {
    }

    @Override
    public void move() {
    }

    @Override
    public void eat(){
        System.out.println("питаются насекомыми");
    }
}
