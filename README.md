# Shape_Calculator
The program is a menu-driven application that calculates the area and volume of shapes. It utilizes object-oriented programming principles.

## Features
The program has the following features:

A menu-driven interface that allows the user to select the shape they want to calculate the area or volume of.

Separate classes for each shape, with methods to calculate the area, perimeter, and volume of the shape.

An abstract Shape class that contains common methods for all shapes.

An interface Volume that contains a method for calculating the volume of a shape.

User input for the required dimensions of the shape.

## Classes:

### Shapes(Circle/Rectangle/Square/Sphere/Cylinder/Pyramid 

### Shape: 
This is an abstract class that contains three abstract methods - calculateShape(), calculatePerimeter(), and showShape(String shape). 
The calculateShape() and calculatePerimeter() methods are used to calculate the area and perimeter of a shape, respectively. The showShape(String shape) method is used to display the selected shape.
Volume:

### Volume: 
This is an interface that contains one abstract method - calculateVolume(). This method is used to calculate the volume of a shape.
User Input:

### Input
The program prompts the user to enter the dimensions of the selected shape. Once the user enters the required input, the program calculates the area and volume of the selected shape.




## How to use

To use the program, simply run the main method and follow the instructions on the console. You will be prompted to select the shape you want to calculate the area or volume of, and then asked to input the necessary dimensions of the shape. The program will then calculate the area or volume and display the result on the console.
