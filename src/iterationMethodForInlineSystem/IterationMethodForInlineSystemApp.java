package iterationMethodForInlineSystem;

public class IterationMethodForInlineSystemApp {

    public static void main(String[] args) {
        double eps = 0.001;
        double x0 = 0.15;
        double y0 = -2;

        double xr = x(y0);
        double yr = y(x0);
        System.out.println(xr);
        System.out.println(yr);

        double xr1 = x(yr);
        double yr1 = y(xr);
        System.out.println(xr1);
        System.out.println(yr1);

        double xr2 = x(yr1);
        double yr2 = y(xr1);
        System.out.println(xr2);
        System.out.println(yr2);

        double xr3 = x(yr2);
        double yr3 = y(xr2);
        System.out.println(xr3);
        System.out.println(yr3);

        double xr4 = x(yr3);
        double yr4 = y(xr3);
        System.out.println(xr4);
        System.out.println(yr4);

        double xr5 = x(yr4);
        double yr5 = y(xr4);
        System.out.println(xr5);
        System.out.println(yr5);

        double xr6 = x(yr5);
        double yr6 = y(xr5);
        System.out.println(xr6);
        System.out.println(yr6);

        double xr7 = x(yr6);
        double yr7 = y(xr6);
        System.out.println(xr7);
        System.out.println(yr7);
    }

    private static double x(double y){
        return 1.0 / 3.0 * Math.cos(y) + 0.3;
    }

    private static double y(double x){
        return Math.sin(x - 0.6) - 1.6;
    }
}
