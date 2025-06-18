package Tasks.Task_12thJune.Multilevelinheritance;

//Multilevel Inheritance Program
// Description: Create class Grandparent
// → Parent → Child and demonstrate multilevel inheritance.
public class Grandparent {

    void grandparent_method(){
        System.out.println("Method of Grand Parent");
    }
}

class parent extends Grandparent {
     void parent_method(){
         System.out.println("Method of Parent");
     }
}

class child extends parent{
    void child_method(){
        System.out.println("Method of child ");
    }
}
