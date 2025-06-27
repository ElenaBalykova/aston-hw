public abstract class Animal {

    private static int animalCounter = 0;

    public Animal() {
        animalCounter++;
    }

    public String getAnimalCounter() {
        return "You created " + animalCounter + " animals";
    }

    public abstract String run(int distance);
    public abstract String swim(int distance);
    public abstract String getThisAnimalCounter();

}
