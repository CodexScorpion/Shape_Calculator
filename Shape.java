abstract public class Shape {

    public void stateShape(String shape){
        System.out.println("The shape is : "+shape);

    }

    //calculateArea() - an abstract method which will calculate and return the area of the shape.

    abstract public double calculateArea();

    //calculatePerimeter() - an abstract method which will calculate and return the perimeter of the shape.
    abstract public double calculatePerimeter();

    //showShape() - a non-abstract method which takes a string argument representing the shape and displays it on the console.
    void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }
}


