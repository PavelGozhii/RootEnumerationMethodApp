package quadFormulaCheburek;

public class QuadFormulaCheburekApp {

    public static void main(String[] args) {
        double[] x = new double[]{-0.883862, -0.529657, -0.323912, 0, 0.323912, 0.529657, 0.883862};
        double[] z = new double[7];
        int n = 7;
        double a = -1;
        double b = 2;
        for (int i = 0; i < z.length; i++) {
            z[i] = ((a + b) / 2) + (((a - b) / 2) * x[i]);
        }
        double integr = ((b - a) / n) * (f(z[0]) + f(z[1]) + f(z[2]) + f(z[3]) + f(z[4]) + f(z[5]) + f(z[6]));
        System.out.println(integr);
    }

    private static double f(double x) {
        return (5 * x - 1) / (1 + Math.exp(x));
    }
}
