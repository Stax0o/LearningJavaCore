package inheritance.figure;

public abstract class Figure {
    private double a;
    private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }

    public abstract double area();
}
