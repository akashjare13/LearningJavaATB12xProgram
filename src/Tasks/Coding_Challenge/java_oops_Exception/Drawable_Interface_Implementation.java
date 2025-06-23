package Tasks.Coding_Challenge.java_oops_Exception;
//Drawable Interface Implementation
//Create an interface "Drawable" with a method "draw()".
// Implement this interface in classes "Circle" and "Rectangle".
public class Drawable_Interface_Implementation {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        Drawable r = new Rectangle();
        r.draw();

    }
}
interface Drawable {
    public void draw();
}

class Circle implements Drawable{

    @Override
    public void draw(){
        System.out.println("Circle Draw");
    }
}

class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}
