package newtonForEqutionSystem;

import java.util.Scanner;

public class NewForEquationSystemApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть початкове значення X:");
        double x = in.nextDouble();
        System.out.println("Введіть початкове значення Y:");
        double y = in.nextDouble();
        System.out.println("Кількість уточнень (ітерацій) коренів рівняння n:");
        double n = in.nextInt();

        for (int i = 0; i < n; i++) {
            double f = 2 * Math.pow(x, 2) + 3 * Math.pow(y, 2) - 6 * y - 4;
            double fi = Math.pow(x, 2) + 4 * x - 3 * Math.pow(y, 2) - 2;
            double fxs = 4 * x;
            double fys = 6 * y - 6;
            double fixs = 2 * x + 4;
            double fiys = -6 * y;
            double dlt = (fxs - fiys) - (fixs * fys);
            double dh = -f * fiys - (-fi * fys);
            double h = dh / dlt;
            double dk = fxs * (-fi) - (fixs * (-f));
            double k = dk / dlt;
            double xi = x + h;
            double yi = y + k;
            x = xi;
            y = yi;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
