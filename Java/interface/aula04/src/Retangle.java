public record Retangle(double heigth, double base) implements GeometricForm{
    
    public Retangle() {
    }

    @Override
    public double area(){
        return heigth * base;
    }
}
