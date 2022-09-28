package HomeWork19;

public class Main {
    public static void main(String[] args) {
        // (7) Животные
        //1 Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
        //2 Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
        //3 Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
        //4 Dog, Cat, Horse переопределяют методы makeNoise, eat.
        //5 Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
        //6 Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
        //7 Пусть этот метод распечатывает food и location пришедшего на прием животного.
        //8 В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
        //9 В цикле отправляйте их на прием к ветеринару.

        final int size = 3;
        Animal[] mas = new Animal[size];
        Animal horse1 = new Horse("трава","поле",87);
        Animal dog1 = new Dog("мясо","степь",16);
        Animal cat1 = new Cat("мышь","город",7);
        mas[0] = horse1;
        mas[1] = dog1;
        mas[2] = cat1;

        Veterinar v1 = new Veterinar();

        for (Animal s:mas) {
            v1.treatAnimal(s);
        }

    }
}
