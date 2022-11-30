package animal;

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
}
