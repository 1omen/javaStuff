package animal;

import java.util.Objects;

public class Dog extends Animal implements TailInterface {
    public static int legsAmount = 4;
    private int height;

    public Dog(int height, int weight, String name) {
        super(name, weight);
        this.height = height;
    }

    public void TailTurn() {
    }

    public void TailGrip() {
    }

    @Override
    public void breath() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return height == dog.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }
}
