package Tasks.Coding_Challenge.java_oops_Exception;
//Method Overriding Demo
//Write a program to demonstrate method overriding by creating
// parent and child classes with the same method signature.
public class Method_Overriding_Demo {

    public static void main(String[] args) {
        parent p = new parent();
        p.signature();
        child c = new child();
        c.signature();
        parent pc = new child();
        pc.signature();
    }
}

class parent {
    void signature(){
        System.out.println("Parent Signature");
    }
}

class child extends parent {
    void signature(){
        System.out.println("Child Signature");
    }
}