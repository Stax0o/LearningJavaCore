package basicSyntax;

public class MyMath {

    private static final double PI = 3.14;

    public static int square(int n) {
        return n * n;
    }

    public static double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
