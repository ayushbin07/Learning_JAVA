package SEP_06;
//abstract
//Used to define abstract classes and methods.
//Abstraction is the process of hiding implementation details
//and showing only the essential features;
//Abstract classes CAN'T be instantiated directly
//Can contain 'abstract' methods (which must be implemented)
//Can contain 'concrete' methods (which are inherited)

import com.sun.tools.javac.Main;

//a shape file is created for this
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*Math.pow(radius,2);
    }
}

class triangle extends Shape{

    double base;
    double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5*base*height;
    }
}

class rectangle extends Shape{

    double length;
    double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;
    }
}
//Shape shape = new Shape; Cannot use this since it is a abstract class.
public class abstraction {
//But can create every other class as object
   static Circle circle = new Circle(3);
    static rectangle rectangle = new rectangle(4,5);
    static triangle triangle = new triangle(6,7);

    public static void main(String[] args) {
        circle.display();
        triangle.display();
        rectangle.display();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}
