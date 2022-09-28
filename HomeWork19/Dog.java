package HomeWork19;

public class Dog extends Animal {
    protected int weightDog;
    private String name = "Собака";

    public Dog(String food, String location, int weightDog) {
        super(food, location);
        this.weightDog = weightDog;
    }

    public void makeNoise(){
        System.out.println("Собака рычит");
    }

    public void eat (){
        System.out.println("Собака ест");
    }

    public String getName() {
        return name;
    }

}
