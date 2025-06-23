package Tasks.Coding_Challenge.java_oops_Exception;

import Tasks.Task_14thJune.Interface_With_Default_And_Static_Method;

//Employee Encapsulation
//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
// Add getter and setter methods.
public class Employee_Encapsulation {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        System.out.println("Employee ID: "+ emp.getId());
        System.out.println("Employee Name: "+ emp.getName());
        System.out.println("Employee Salary: "+ emp.getsalary());
    }
}

class Employee{
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getsalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}