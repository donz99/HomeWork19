package HomeWork19_2;

import HomeWork19.*;

public class Main {
    public static void main(String[] args) {
        //  (9) Фигуры
        //1 Создайте супер класс Shape и его наследников Circle, Rectangle.
        //2 Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
        //3 Классы Circle, Rectangle содержат координаты точек.
        //4 Создать массив содержащий эти фигуры.
        //5 В цикле нарисовать их (вызвать метод draw).
        //6 Добавить метод equals() для классов Shape, Circle, Rectangle.

        final int size = 2;
        Shape[] mas = new Shape[size];
        Shape circle1 = new Circle(2,5,-2,-9);
        Shape rectangle1 = new Rectangle(-2,-1,-9,-25);
        mas[0] = circle1;
        mas[1] = rectangle1;

        for (Shape s:mas) {
            s.draw();
        }
    }
}
