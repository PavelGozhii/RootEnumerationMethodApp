package newtownInterpolationMethod;

public class NewtonInterpolationMethodApp {

    public static void main(String[] args) {
        int n = 4;
        int h = 2;
        double xr = 5.8;
        double[] x = new double[]{1, 3, 5, 7};
        double[] y = new double[]{1, 5, 14, 81};

        double a1 = Math.abs(xr - x[0]);
        double a2 = Math.abs(xr - x[1]);
        double a3 = Math.abs(xr - x[2]);
        double a4 = Math.abs(xr - x[3]);

        double q = Math.min(a4, Math.min(a3, Math.min(a1, a2))) / h;

        System.out.println(q);

        double dy0 = y[1] - y[0];
        double dy1 = y[2] - y[1];
        double dy2 = y[3] - y[2];

        double d2y0 = dy1 - dy0;
        double d2y1 = dy2 - dy1;

        double d3y0 = d2y1 - d2y0;

        System.out.println(dy0);
        System.out.println(d2y0);
        System.out.println(d3y0);

        double pn = y[0] + (dy0 / h) * (xr - x[0]) + (d2y0 / (2 * h * h)) * (xr - x[0]) * (xr - x[1]) + (d3y0 / (6 * h * h * h)) * (xr - x[0]) * (xr - x[1]) * (xr - x[2]);

//        double pnq = y[0] + (dy0 * q) + ((q * (q - 1))) / 2 * d2y0 + ((q * (q - 1) * (q - 2))) / 6 * d3y0;

        System.out.println(String.format("%.3f", pn));

//        System.out.println(pnq);
    }
}
