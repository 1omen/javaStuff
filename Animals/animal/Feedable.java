package animal;

public interface Feedable {
    void eat();

    default void drink() {
    }
}
