package importerIntegrals;

public class ImproperIntegralsApp {

    public static void main(String[] args) {
        double[] x = new double[]{0.95857246461382, 2.0201828704561, 0, -0.95857246461382, -2.0201828704561};
        double[] c = new double[]{0.3936193231522, 0.01995324205905, 0.9453087204829, 0.3936193231522, 0.01995324205905};
        double s = 0;
        for (int i = 0; i < x.length; i++) {
            s += (c[i] * f(x[i]));
        }
        System.out.println("Значення інтегралу дорівнює " + s);
    }

    private static double f(double x) {
        return Math.cos(x);
    }
}
