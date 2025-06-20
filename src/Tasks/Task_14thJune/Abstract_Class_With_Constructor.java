package Tasks.Task_14thJune;
//Abstract Class with Constructor
//Description: Show that abstract class can have constructor.
// Print message from constructor and method.
//🔶Expected Output:
//Abstract class constructor called
//Method from abstract class
public class Abstract_Class_With_Constructor {
    public static void main(String[] args) {
        Absclass abs = new Absclass();
        abs.ShowAbstract();

    }
}

abstract class MyAbstractClass{
    MyAbstractClass(){
        System.out.println("Abstract class constructor called");
    }
    void ShowAbstract(){
        System.out.println("Method from abstract class");
    }
}

class Absclass extends MyAbstractClass{
    Absclass(){
        super();
    }
}


