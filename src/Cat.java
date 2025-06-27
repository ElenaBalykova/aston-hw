public class Cat extends Animal {

    private static int counter = 0;
    private String catName;
    private boolean satiety = false;
    private int currentEatQuantity = 0;


    public Cat(String catName) {
        this.catName = catName;
        counter++;
    }

    @Override
    public String run(int distance) {
        if(distance >= 0 & distance < 201) {
            return catName + " пробежал " + distance + " м.\n";
        }
        return "Wrong distance\n";
    }

    @Override
    public String swim(int distsnce){
        return "Коты не умеют плавать. \n";
    }

    @Override
    public String getThisAnimalCounter() {
        return "You created " + counter + " cat(s)";
    }
    public String eatFromBowl(int eatQuantity, int tryToEat) {
        currentEatQuantity = eatQuantity;
        if (currentEatQuantity >= tryToEat) {
            satiety = true;
            return "Cat " + catName + " is satiety";
        }

        return "Cat " + catName + " cannot eat";
    }

    public void addEatToBowl(int eatQuantity) {
        currentEatQuantity += eatQuantity;
    }

    public String getSatiety() {
        return (satiety)? "Cat " + catName +  " is satiety" : "Cat " + catName + " no satiety";
    }

    public static void main(String[] args) {
        Cat first = new Cat("Том");

        System.out.print(first.run(10));
        System.out.print(first.run(201));
        System.out.print(first.swim(10));
        System.out.println(first.getThisAnimalCounter());

        Cat second = new Cat("Шнурок");
        System.out.println(second.getThisAnimalCounter());

        Cat third = new Cat("Барсик");
        System.out.println(third.getThisAnimalCounter());
        System.out.println(third.getAnimalCounter());

        Cat[] cats = {first, second, third};

        System.out.println(cats[0].eatFromBowl(10, 15));
        System.out.println(cats[1].eatFromBowl(10, 10));
        System.out.println(cats[2].eatFromBowl(30, 15));

        System.out.println(cats[0].getSatiety());
        System.out.println(cats[1].getSatiety());
        System.out.println(cats[2].getSatiety());
    }

}
