class Pyramid extends Shape implements Volume {
    double baseLength, baseWidth, height;
    Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }
    public double calculateArea() {
        return baseLength * baseWidth + baseLength * Math.sqrt((baseWidth/2)*(baseWidth/2) + height*height) + baseWidth * Math.sqrt((baseLength/2)*(baseLength/2) + height*height);
    }
    public double calculatePerimeter() {
        return 2 * (baseLength + baseWidth);
    }
    public double calculateVolume() {
        return (1/3) * baseLength * baseWidth * height;
    }
}
