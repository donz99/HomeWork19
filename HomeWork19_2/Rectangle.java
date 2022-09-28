package HomeWork19_2;

public class Rectangle extends Shape {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public String name = "Прямоугольник";

    public Rectangle(){}

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Программа рисует: " + name + " цвета " + getColor() + " с координатами: x1=" +x1+", y1="+y1+", x2="+x2+", y2="+y2);
    }

    public void equals(){}
}
