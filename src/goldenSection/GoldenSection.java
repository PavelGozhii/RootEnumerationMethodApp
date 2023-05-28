package goldenSection;

import java.util.Scanner;

public class GoldenSection {

    private static int n = 0;
    private static double x1, x2, x3, x4;

    private static double a, b, e;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть ліву межа А: ");
        a = in.nextDouble();
        System.out.println("Введіть праву межа B: ");
        b = in.nextDouble();
        System.out.println("Введіть похибку обчислень e: ");
        e = in.nextDouble();
        double ebs = (Math.sqrt(5) + 1) / 2;
        System.out.println(ebs);

        x2 = b - (b - a) / ebs;
        x3 = a + (b - a) / ebs;
        System.out.println(x2);
        System.out.println(x3);
        x1 = a;
        x4 = b;
        double y1 = f(x1);
        double y2 = f(x2);
        double y3 = f(x3);
        double y4 = f(x4);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
        function();
    }


    private static void function() {
        double y1 = f(x1);
        double y2 = f(x2);
        double y3 = f(x3);
        double y4 = f(x4);
        if (y2 < y1 && y2 < y3 && y2 < y4) {
            double x = x3 + x1 - x2;
            System.out.println(x);
            n++;
            if ((x2 - x) < e) {
                System.out.println(n);
                System.out.println(x);
                System.out.println(y2);
                System.exit(0);
            }
            x2 = x;
            function();
        } else if (y3 < y1 && y3 < y2 && y3 < y4) {
            double x = x2 + x4 - x3;
            System.out.println(x);
            n++;
            if ((x3 - x) < e) {
                System.out.println(n);
                System.out.println(x);
                System.out.println(y3);
                System.exit(0);
            }
            x3 = x;
            function();
        }
    }

    private static double f(double x) {
        return 27 - 2 * x * (9 - x) * Math.exp((-x) / 3);
    }
}
