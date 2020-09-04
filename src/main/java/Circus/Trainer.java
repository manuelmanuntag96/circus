package Circus;

import Circus.animal.Animal;
import Circus.animal.Bird;
import Circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        // train(new Circus.animal.Parrot());
        //Circus.animal.Animal a2 = new Circus.animal.Animal();
        //Circus.animal.Bird b2 = new Circus.animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
