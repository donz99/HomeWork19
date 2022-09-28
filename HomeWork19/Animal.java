package HomeWork19;

import java.util.Objects;

public class Animal {
    protected String food;
    protected String location;
    protected String name;

    public Animal(){}

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Такое-то животное издаёт звук");
    }

    public void eat (){
        System.out.println("Такое-то животное ест");
    }

    public void sleep(){
        System.out.println("Такое-то животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }









}
