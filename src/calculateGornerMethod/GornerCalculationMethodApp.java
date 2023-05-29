package calculateGornerMethod;

public class GornerCalculationMethodApp {

    public static void main(String[] args) {
        double[] a = new double[]{3, 5, 7, -9, 4, -2};
        double x = 4.3;
        int n = 5;
        double s = a[0];
        for(int i = 0; i < n; i++){
            System.out.println(s);
            s = s * x + a[i + 1];
        }
        System.out.println(s);
    }
}
