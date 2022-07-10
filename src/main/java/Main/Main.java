package Main;

import animals.Animal;
import animals.Bat;
import animals.Cat;
import animals.Whale;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Garfield");
        System.out.println(cat.test());

        Animal whale = new Whale();
        System.out.println(whale.test());

        Animal bat = new Bat();
        System.out.println(bat.test());
    }
}
