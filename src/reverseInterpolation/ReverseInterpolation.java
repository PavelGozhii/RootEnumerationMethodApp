package reverseInterpolation;

public class ReverseInterpolation {

    public static void main(String[] args) {
        double[] x = new double[]{10, 15, 17, 20};
        double[] y = new double[]{3, 7, 11, 17};
        double ya  = 10;

        double k1 = (ya - y[1]) * (ya - y[2]) * (ya - y[3]);
        double k2 = (y[0] - y[1]) * (y[0] - y[2]) * (y[0] - y[3]);
        double r1 = x[0] * (k1 / k2);
        System.out.println(r1);

        double k3 = (ya - y[0]) * (ya - y[2]) * (ya - y[3]);
        double k4 = (y[1] - y[0]) * (y[1] - y[2]) * (y[1] - y[3]);
        double r2 = x[1] * (k3 / k4);
        System.out.println(r2);

        double k5 = (ya - y[0]) * (ya - y[1]) * (ya - y[3]);
        double k6 = (y[2] - y[0]) * (y[2] - y[1]) * (y[2] - y[3]);
        double r3 = x[2] * (k5 / k6);
        System.out.println(r3);

        double k7 = (ya - y[0]) * (ya - y[1]) * (ya - y[2]);
        double k8 = (y[3] - y[0]) * (y[3] - y[1]) * (y[3] - y[2]);
        double r4 = x[3] * (k7 / k8);
        System.out.println(r4);

        double xa = r1 + r2 + r3 + r4;
        System.out.println(xa);
    }


}
