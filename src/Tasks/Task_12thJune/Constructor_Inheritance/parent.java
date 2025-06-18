package Tasks.Task_12thJune.Constructor_Inheritance;

//Constructor in Inheritance Program

// Description: Show how constructors of parent and child classes are called.

public class parent {
    parent(){
        System.out.println("Parent constructor");
    }

}
class child extends  parent{
    child(){
        System.out.println("Child Constructor");
    }
}
