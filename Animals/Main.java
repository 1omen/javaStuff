
import animal.Animal;
import animal.Dog;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dog sharik = new Dog(3, 3, "Larry");
        new Dog(3, 9, "Lola");
        feed(sharik);

        Animal exAnimal = new Dog(60,34,"Larry") {
            @Override
            public void breath() {
            System.out.println(MessageFormat.format("{0} is goddam breathing!", 123));
            }
        };
        exAnimal.breath();
        exAnimal.getName();
    }

    public static void feed(Animal animalTofeed) {
        animalTofeed.eat();
        System.out.println("I am feeding animal named " + animalTofeed.getName());
    }
}
