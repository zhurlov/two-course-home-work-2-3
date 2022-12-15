public class Predators extends Mammals {
    private String typeOfFood;

    public String getTypeOfFood() {
        if (typeOfFood == null || typeOfFood.isEmpty()){
            this.typeOfFood = "ошибка";
        }
        return typeOfFood;
    }


    public static void hunt(){

    }


}
