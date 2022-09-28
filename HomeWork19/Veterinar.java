package HomeWork19;

public class Veterinar extends Animal {

    public Veterinar() {
    }

    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " ест " +animal.getFood() +" и обитает в "+animal.location);
    }


}
