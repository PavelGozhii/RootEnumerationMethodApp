package gausInterpolationFormulas;

public class GaussInterpolationFormulaApp {

    public static void main(String[] args) {
        double[] x = new double[]{3, 4, 5, 6};
        double[] y = new double[]{9, 16, 30, 72};
        double[] d = new double[3];

        double dr = 1;
        for (int i = 0; i < d.length; i++) {
            d[i] = dr * (i + 1);
            dr = d[i];
            System.out.println(d[i]);
        }
        double h = x[0] - x[1];

        double xr = 4.5;
        double a1 = Math.abs(xr - x[0]);
        double a2 = Math.abs(xr - x[1]);
        double a3 = Math.abs(xr - x[2]);
        double a4 = Math.abs(xr - x[3]);

        double q = Math.min(a1, Math.min(a2, Math.min(a3, a4)));

        System.out.println(q);

        double dy1 = y[1] - y[0];
        double dy2 = y[2] - y[1];
        double dy3 = y[3] - y[2];

        double ddy1 = dy2 - dy1;
        double ddy2 = dy3 - dy2;

        double dddy1 = ddy2 - ddy1;

        double pX = y[1] + q * dy2+ (q * (q -1)) / d[1] * ddy1 + ((q + 1) * q * (q - 1)) / d[2] * dddy1;

        System.out.println(pX);
    }

}
