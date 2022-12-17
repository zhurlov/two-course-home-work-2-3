public class Birds extends Animals {
    private String habitat;

    final String getHabitat() {
        return habitat;
    }

    final void setHabitat(String habitat) {
        Validate.validateString(habitat, "ОШИБКА");
        this.habitat = habitat;
    }

    public static void hunt(){
        System.out.println("по месту обитания");
    }

    @Override
    public void sleep() {
    }

    @Override
    public void move() {
    }

    @Override
    public void eat(){
        System.out.println("растительноядная пища");
    }
}
