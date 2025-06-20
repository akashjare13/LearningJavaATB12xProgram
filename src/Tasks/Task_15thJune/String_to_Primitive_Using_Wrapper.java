package Tasks.Task_15thJune;
//Converting String to Primitive Using Wrapper
//Description: Uses wrapper class methods to parse a numeric
// string into a primitive int.
public class String_to_Primitive_Using_Wrapper {

    public static void main(String[] args) {
        String a = "1234";
        //String s = "Hello";

        int b = Integer.parseInt(a);

        System.out.println(b);
        System.out.println(((Object) b).getClass().getSimpleName());
       // System.out.println(((Object) s).getClass().getSimpleName());

    }
}
