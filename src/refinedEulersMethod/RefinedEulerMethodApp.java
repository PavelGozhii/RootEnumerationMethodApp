package refinedEulersMethod;

import java.util.Scanner;

public class RefinedEulerMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть початкове значення X0:");
        double x0 = in.nextDouble();
        System.out.println("Введіть початкове значення Y0:");
        double y0 = in.nextDouble();
        System.out.println("Введіть x, для якого необхідно розрахувати Y: ");
        double b = in.nextInt();
        double n = 0;
        while (n <= 0) {
            System.out.println("Кількість уточнень (ітерацій) коренів рівняння n:");
            n = in.nextInt();
        }
        double f1 = 0;
        double h = (b - x0) / n;
        double x = x0;
        double z = y0;
        for (int i = 0; i < n; i++) {
            double y = z;
            double f = 2 * x - y;
            y = z + h * (f + f1) / 2;
            f1 = f;
            x+=h;
            System.out.println("Y(" + x + ") = " + y);
            z = y;
        }
    }
}
