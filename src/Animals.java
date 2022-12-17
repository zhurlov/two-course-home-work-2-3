import java.time.LocalDate;

public abstract class  Animals {
    private String animalName;
    private int numberOfYears;

    public String getAnimalName() {
        Validate.validateString(animalName, "ОШИБКА");
        return animalName;
    }

    public int getNumberOfYears() {
        Validate.validateInt(numberOfYears, 0);
        this.numberOfYears = LocalDate.now().getYear() - numberOfYears;
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        Validate.validateInt(numberOfYears, 18);
    }

    public abstract void sleep();
    public abstract void move();
    public static String eat(String eat){
        return eat;
    }
    public abstract void eat();
}
