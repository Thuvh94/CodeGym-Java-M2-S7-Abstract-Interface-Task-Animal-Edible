import animal.*;
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals){
            String sound = animal.makeSound();
            System.out.println(sound);
        }
    }
}
