import java.time.LocalDate;

public class Car extends Transport {

    private String brand;
    private int yearOfIssue;
    private String countryOfOrigin;

    public Car(int yearOfIssue) {
        this("Challenger", 1965, "America");
        //this.yearOfIssue = yearOfIssue;
    }

    public Car(String brand, int yearOfIssue, String countryOfOrigin) {
        super("Tugella", "gray green",  320);
        setBrand(brand);
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void refill(){
        System.out.println("можно заправлять бензином, дизелем");
        System.out.println("для электрокаров заряжаться на специальный электропарковках");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()){
            this.brand = "не верно заполнена поле";

        } else {
            this.brand = brand;
        }
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue == 0 || yearOfIssue <= -1){
            this.yearOfIssue = LocalDate.now().getDayOfYear();
        }
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String toString() {
        return brand + " " + getModel() + " " + yearOfIssue + " " + countryOfOrigin + " " + getBodyColor() + " " + getMaximumMovementSpeed() ;
    }

}
