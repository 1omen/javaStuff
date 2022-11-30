//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package animal;

public class Snake extends Animal {
    private int length;
    private boolean poisonable;
    private int thickness;

    public Snake(int length, int weight, boolean poisonable, int thickness, String name) {
        super(name, weight);
        this.length = length;
        this.weight = weight;
        this.poisonable = poisonable;
        this.thickness = thickness;
    }

    public void move() {
    }

    @Override
    public void breath() {

    }
}
