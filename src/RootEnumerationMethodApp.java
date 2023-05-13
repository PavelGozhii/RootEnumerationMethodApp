import java.util.Scanner;

public class RootEnumerationMethodApp {

    private static int k;
    private static double x, a, b, u, v, h;
    private static String w = "";

    public static void main(String[] args) {
        third();
    }

    public static void first() {
        u = v;
        x = x + h;
        second();
    }

    public static void second() {
        Scanner in = new Scanner(System.in);
        if (x > b) {
            System.out.println("Закінчити програму?");
            boolean choose = in.nextBoolean();
            if (choose) System.exit(0);
            third();
        }
        v = f(x);
        if (sng(u) == sng(v)) {
            first();
        } else {
            k = 1;
            for (int i = 0; i < k; i++) {
                w = w + x + " ";
                System.out.println(w);
            }
            first();
        }
    }

    public static void third() {
        Scanner in = new Scanner(System.in);
        System.out.println("a = ");
        a = in.nextDouble();
        System.out.println("b = ");
        b = in.nextDouble();
        System.out.println("h = ");
        h = in.nextDouble();
        x = a;
        u = f(x);
        x = x + h;
        second();
    }
// код не кот
    private static double f(double x) {
        return Math.pow(x, 3) - (5 * Math.pow(x, 2)) + (2 * x) + 6;
    }

    private static int sng(double a) {
        return a > 0 ? 1 : a < 0 ? -1 : 0;
    }
}