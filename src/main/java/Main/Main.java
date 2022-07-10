package Main;

import animals.Animal;
import animals.Bat;
import animals.Cat;
import animals.Whale;

public class Main {

    public static void main(String[] args) {


        Animal[] animals = { new Cat("Garfield"), new Whale(), new Bat()};
        for (Animal animal : animals) {
            System.out.println(animal.test());
            if (animal.getClass() == Cat.class) {
                ((Cat) animal).run();
            }
            if (animal.getClass() == Whale.class) {
                ((Whale) animal).swim();
            }
            if (animal.getClass() == Bat.class) {
                ((Bat) animal).fly();
            }
        }
    }
}
