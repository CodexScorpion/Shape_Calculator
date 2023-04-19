public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        return perimeter;
    }
}
