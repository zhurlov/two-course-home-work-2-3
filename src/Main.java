public class Main {
    public static void main(String[] args) {


        Herbivores gazelle = new Herbivores();
        Herbivores giraffe = new Herbivores();
        Herbivores horse = new Herbivores();
        Animals.eat("употребляют растительную пищу");
        System.out.println(Animals.eat("употребляют растительную пищу"));
        //gazelle.eat();

        Predators hyena = new Predators();
        Predators tiger = new Predators();
        Predators bear = new Predators();
        Animals.eat("употребляют животную пищу");

        Amphibians frog = new Amphibians();
        Amphibians alreadyFreshwater = new Amphibians();
        Animals.eat("употребляет земноводную пищу");

        Flightless peacock = new Flightless();
        Flightless penguin = new Flightless();
        Flightless dodoBird = new Flightless();
        Animals.eat("употребляет насекомую, земноводную пищу");

        Flying gull = new Flying();
        Flying albatross = new Flying();
        Flying falcon = new Flying();
        Animals.eat("употребляет насекомую, земноводную пищу");

        //Herbivores.graze();

        Herbivores herbivores = new Herbivores();




    }
}