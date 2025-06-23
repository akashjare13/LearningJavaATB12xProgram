package Tasks.Coding_Challenge.java_oops_Exception;
//Person Class Implementation
//Create a class "Person" with attributes "name" and "age".
// Create two instances and print their details.
public class Person_Class_Implementation {
    public static void main(String[] args) {

        Person p = new Person("John", 25);
        Person p1 = new Person("Alice", 30);
        p.Details();
        p1.Details();
    }
}

class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Details() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

