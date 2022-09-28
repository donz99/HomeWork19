package HomeWork19;

public class Horse extends Animal {
    private int speedHorse;
    private String name = "Лошадь";

    public Horse(String food, String location, int speedHorse) {
        super(food, location);
        this.speedHorse = speedHorse;
    }

    public void makeNoise(){
        System.out.println("Лошадь ржёт");
    }

    public void eat (){
        System.out.println("Лошадь ест");
    }

    public String getName() {
        return name;
    }


}
