package Tasks.Coding_Challenge.java_oops_Exception;
//Abstract Shape Implementation
//Implement an abstract class "Shape" with an abstract method "getArea()".
// Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
public class Abstract_Shape_Implementation {
    public static void main(String[] args) {
        Shape r = new rectangle(10.5,5);
        Shape s = new circle(2);


        System.out.println(r.getArea());
        System.out.println(s.getArea());

    }
}

abstract  class Shape{
    abstract double getArea();
}

class rectangle extends Shape{
    double length;
    double width;

    rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class circle extends Shape{
    double radius;

    circle(double radius){
        this.radius = radius;
    }

    @Override
    double getArea(){
        return Math.PI * radius * radius;
    }
}


