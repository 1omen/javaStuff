import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(3, 8));
        System.out.println(expa(60, 10));
        System.out.println(facto(10));
    }


    public static float add(float a, float b) {
        return a + b;
    }

    public static float expa(float a, int b) {
        var sth = (float) 1;
        for (int i = 0; i < b; i++) {
            sth = sth * a;
        }
        return sth;
    }

    public static float facto(int a) {
        int num = a;
        long factorial = multiplyNumbers(num);
        return factorial;
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }


}


