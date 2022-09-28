package HomeWork19;

public class Cat extends Animal {
    private int eyeColor;
    private String name = "Кот";

    public Cat(String food, String location, int eyeColor) {
        super(food, location);
        this.eyeColor = eyeColor;
    }

    public void makeNoise(){
        System.out.println("Кот мурчит");
    }

    public void eat (){
        System.out.println("Кот ест");
    }

    public String getName() {
        return name;
    }


}
