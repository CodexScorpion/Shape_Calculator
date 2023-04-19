class Cylinder extends Shape implements Volume {
    double radius, height;
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}