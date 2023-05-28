package polinomLaCringe;

public class PolinomLaCringeApp {

    public static void main(String[] args) {
        int n = 4;
        double[] x = new double[4];
        double[] y = new double[4];

        double xrozr = 2.4;

        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 5;
        y[0] = 1;
        y[1] = 5;
        y[2] = 14;
        y[3] = 81;

        double z1 = y[0] / (x[0] - x[1]) * (x[0] - x[2]) * (x[0] - x[3]);
        double z2 = y[1] / (x[1] - x[0]) * (x[1] - x[2]) * (x[1] - x[3]);
        double z3 = y[2] / (x[2] - x[0]) * (x[2] - x[1]) * (x[2] - x[3]);
        double z4 = y[3] / (x[3] - x[0]) * (x[3] - x[1]) * (x[3] - x[2]);

        double pol1 = z1 * (xrozr - x[1]) * (xrozr - x[2]) * (xrozr - x[3]);
        double pol2 = z2 * (xrozr - x[0]) * (xrozr - x[2]) * (xrozr - x[3]);
        double pol3 = z3 * (xrozr - x[0]) * (xrozr - x[1]) * (xrozr - x[3]);
        double pol4 = z4 * (xrozr - x[0]) * (xrozr - x[1]) * (xrozr - x[2]);

        double polinom = pol1 + pol2 + pol3 + pol4;

        System.out.println("Polinom = " + String.format( "%.3f", polinom));
    }

}
