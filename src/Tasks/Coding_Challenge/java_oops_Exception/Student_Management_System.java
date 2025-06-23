package Tasks.Coding_Challenge.java_oops_Exception;
//Student Management System
//Implement a class "Student" with attributes "name", "rollNo", and "section".
// Add a method to print student details.
public class Student_Management_System {
    public static void main(String[] args) {

        Student st = new Student("Bob",101, "A" );
        st.printDetails();

    }
}

class Student{
    String name;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }


    void printDetails(){
        System.out.println("Name: "+ name + ", RollNo: "+ rollNo + ", Section: "+ section);

    }
}
