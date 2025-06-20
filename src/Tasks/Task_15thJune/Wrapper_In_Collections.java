package Tasks.Task_15thJune;

import java.util.ArrayList;
//Using Wrapper in Collections
//Description: Shows why wrapper classes are needed in Java
// Collections (which do not support primitives).
public class Wrapper_In_Collections {
    public static void main(String[] args)
    {

        //ArrayList<int> s = new ArrayList<int>();
        int a = 5;
        Integer b = a;
        ArrayList<Integer> i = new ArrayList<>();
        i.add(a);
        i.add(10);  // autoboxing
        i.add(11);  // autoboxing again
        i.add(12);  // autoboxing again
        i.add(13);  // autoboxing again
        i.add(14);  // autoboxing again
        i.add(15);  // autoboxing again
        System.out.println("ArrayList: " + i);
    }
}
