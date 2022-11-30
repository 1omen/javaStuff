import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        rotate(Rotation.LEFT);
    }

    public static void rotate(int angle) {

    }

    public static void rotate(Rotation direction) {
        switch (direction) {
            case LEFT:
                System.out.println("I am rotated to the " + direction.getTextForm());
                break;
            case RIGHT:
                System.out.println("I am rotated to the right");
                break;
        }
        //System.out.println(MessageFormat.format("I''m rotating to the {0}", direction.getTF()));
    }
}
