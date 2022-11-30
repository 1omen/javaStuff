package animal;

public abstract class Animal {
    protected String name;
    protected int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move() {
        System.out.println("I'm moving");
    }

    public void eat() {
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void breath();
}