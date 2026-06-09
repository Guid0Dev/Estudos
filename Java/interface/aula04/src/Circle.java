public record Circle(double radius) implements GeometricForm{
    private static final double pi = 3.14;

    public Circle() {
    }

    @Override
    public double area(){
        return pi * math.pow(radius, 2);
    }
}
