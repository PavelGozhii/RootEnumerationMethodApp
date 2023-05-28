package gaussQuadInterpolationFormulaApp;

public class GaussQuadFormulaApp {

    public static void main(String[] args) {
        double x1 =  -0.9062; double x2 = -0.5385; double x3 = 0; double x4 = 0.5385; double x5 =  0.9062;
        double a1 = 0.2369; double a2 = 0.4786; double a3 =  0.5689; double a4 =  0.4786; double a5 =  0.2369;

        double i5 = 2 * (a1 / (4 + Math.pow(x1 + 1, 2)) + a2 / (4 + Math.pow(x2 + 1, 2)) + a3 / (4 + Math.pow(x3 + 1, 2)) + a4 / (4 + Math.pow(x4 + 1, 2)) + a5 / (4 + Math.pow(x5 + 1, 2)));

        System.out.println(i5);
    }
}
