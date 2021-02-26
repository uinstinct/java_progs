/* LAB 7
4. Write a program in java to define a class Shape which has data member „area‟
and a member function showArea(). Derive two classes Circle and Rectangle
from Shape class. Add appropriate data members and member functions to
calculate and display the area of Circle and Rectangle.
*/

class Shape {
    double area;

    void showArea() {
        System.out.println("The area of the shape is " + area);
    }
}

class Circle extends Shape {
    double radius;

    void calcuate() {
        super.area = 3.14 * radius * radius;
    }

}

class Rectangle extends Shape {
    double length;
    double breadth;

    void calculate() {
        super.area = length * breadth;
    }
}

public class calculateArea {
    public static void main(String args[]) {
        System.out.println("CIRCLE");

        Circle c = new Circle();
        c.radius = 3.4;
        c.calcuate();
        c.showArea();

        System.out.println("RECTANGLE");
        Rectangle r = new Rectangle();
        r.length = 5.0;
        r.breadth = 4.6;
        r.calculate();
        r.showArea();
    }
}