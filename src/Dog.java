public class Dog extends Animal {

    private static int counter = 0;

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
        counter++;
    }

    @Override
    public String run(int distance) {
        if(distance >= 0 & distance < 501) {
            return dogName + " пробежал " + distance + " м.\n";
        }
        return "Wrong distance\n";
    }

    @Override
    public String swim(int distance) {
        if (distance >= 0 & distance < 11) {
            return dogName + " проплыл " + distance + " м.\n";
        }
        return "Wrong distance\n";
    }

    @Override
    public String getThisAnimalCounter() {
        return "You created " + counter + " dog(s)";
    }
    public static void main(String[] args) {
        Animal first = new Dog("Бобик");

        System.out.print(first.run(15));
        System.out.print(first.run(501));
        System.out.print(first.swim(10));
        System.out.print(first.swim(11));
        System.out.println(first.getThisAnimalCounter());

        Animal second = new Dog("Тузик");
        System.out.println(second.getThisAnimalCounter());

        Animal third = new Dog("Шарик");
        System.out.println(third.getThisAnimalCounter());

        System.out.println(third.getAnimalCounter());
    }
}
