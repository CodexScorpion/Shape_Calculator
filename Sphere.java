public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        // No perimeter for a sphere
        return 0;
    }

    @Override
    public double calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
        return volume;
    }
}
