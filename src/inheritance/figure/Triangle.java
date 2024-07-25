package inheritance.figure;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double area() {
        double p = (super.getA()+super.getB()+c)/2;
        return Math.sqrt(p*(p-super.getA())*(p-super.getB())*(p-c));
    }
}
