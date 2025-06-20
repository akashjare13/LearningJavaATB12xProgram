package Tasks.Task_14thJune;

//Multiple Inheritance Using Interfaces
//🔶 Objective:
//Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
//🔶 Steps:
//Create two interfaces: Printable and Showable.
//Each interface should have a method: print() and show() respectively.
//Create a class Document that implements both interfaces.
//Implement both methods in the Document class.
//In the main() method, create a Document object and call both methods.
//🔶 Expected Output:
//Printing Document
//Showing Document

// Interface 1
interface Printable {
    void print(); // abstract method
}

// Interface 2
interface Showable {
    void show(); // abstract method
}

// Class implementing both interfaces
class Document implements Printable, Showable {

    // Implementing print() method from Printable
    public void print() {
        System.out.println("Printing the document");
    }

    // Implementing show() method from Showable
    public void show() {
        System.out.println("Showing the document");
    }

}

public class Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
        Document obj = new Document();
        obj.print();
        obj.show();
    }
}