import java.time.LocalDate;

public class Animals {
    private String animalName;
    private int numberOfYears;

    public String getAnimalName() {
        if (animalName == null || animalName.isEmpty()){
            this.animalName = "ошибка";
        }
        return animalName;
    }

    public int getNumberOfYears() {
        this.numberOfYears = LocalDate.now().getYear() -numberOfYears;
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears != 0){
            this.numberOfYears = numberOfYears;
        } else {
            this.numberOfYears = 18;
        }
    }

    public static void sleep(){

    }
    public static void move(){

    }
    public static String eat(String eat){
        return eat;
    }

    public void eat(){

    }

}
