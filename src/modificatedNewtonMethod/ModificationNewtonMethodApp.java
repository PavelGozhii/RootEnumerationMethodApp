package modificatedNewtonMethod;

import java.util.Scanner;

public class ModificationNewtonMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть початкове значення X:");
        double x = in.nextDouble();
        System.out.println("Введіть похибку через eps: ");
        double eps = in.nextDouble();
        while(true){
            double xnext = x - f(x) * eps / (f(x + eps) - f(x));
            if(Math.abs(xnext - x) < eps) {
                System.out.println("Корінь х дорівнює " + x);
                return;
            }
            x = xnext;
        }
    }

    private static double f(double x){
        return Math.pow(x, 3.0) - 5.0 * Math.pow(x, 2.0) + 2.0 * x + 6.0;
    }
}
