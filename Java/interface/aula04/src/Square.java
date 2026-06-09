public record Square(double side, double base) implements GeometricForm{
    
    public Square() {
    }

    @Override
    public double area(){
        return side*side;
    }
}
