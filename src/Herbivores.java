import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public String getTypeOfFood() {
        Validate.validateString(typeOfFood, "ОШИБКА");
        return typeOfFood;
    }
    public static void graze(){
        System.out.println("пастись стадами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
    @Override
    public  void eat(){
        return;
    }
}
