package polarCoordinateSystem;

import java.util.Scanner;

public class PolarCoordinateSystemApp {
    public static void main(String[] args) {
        System.out.println("Point A and B in usual coordinates");
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть x1: ");
        double x1 = in.nextDouble();
        System.out.println("Введіть y1: ");
        double y1 = in.nextDouble();
        System.out.println("Введіть x2: ");
        double x2 = in.nextDouble();
        System.out.println("Введіть y2: ");
        double y2 = in.nextDouble();
        double[] r01;
        double[] r02;
        r01 = polar(x1, y1);
        r02 = polar(x2, y2);
        System.out.println("Points A and B in polar coordinates");
        System.out.println(r01[0]);
        System.out.println(r02[0]);
        System.out.println(r01[1]);
        System.out.println(r02[1]);
        double s = Math.abs(r01[0] * r02[0] * Math.sin(r01[1] - r02[1])) / 2;
        System.out.println("Площа трикутнику S дорівняє " + Math.round(s));
    }

    private static double[] polar(double x, double y) {
        double ro = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double fi;
        if (x == 0) {
            double znak;
            if (y > 0) {
                znak = 1;
            } else if (y < 0) {
                znak = -1;
            } else {
                znak = 0;
            }
            fi = znak * 1.570796;
        } else {
            fi = Math.atan(y / x);
        }
        return new double[] {ro, fi};
    }
}
