package testMethod;

import java.util.Scanner;

public class TestMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        while (a >= b) {
            System.out.println("Введіть нижню границю A:");
            a = in.nextDouble();
            System.out.println("Введіть верхню границю B:");
            b = in.nextDouble();
        }
        double e = 0;
        while (e <= 0) {
            System.out.println("Введіть точність Е: ");
            e = in.nextDouble();
        }

        double c = (a + b) / 2.0;
        while (b - a < 2.0 * e || y(c) == 0) {
            c = (a + b) / 2.0;
            if (y(c) * y(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        double x = (a + b) / 2.0;
        System.out.println("Корінь Х дорівнює " + x);
    }

    private static double y(double x) {
        return Math.pow(x, 3) + 3 * Math.pow(x, 2) - 3;
    }
}
