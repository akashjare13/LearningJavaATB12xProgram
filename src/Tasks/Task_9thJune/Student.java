package Tasks.Task_9thJune;

//1) Student Class Constructor
//➤ Create a class Student with a constructor to initialize name and age.
// Print both using a display method.
public class Student {
    // Instance variables
    private String name;
    private int age;

    // Constructor
     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    // Main method to test the class
    public static void main(String[] args) {
        Student student1 = new Student("Akash", 27);
        student1.display();
    }
}
