package Tasks.Task_15thJune;

// Multiple Catch Blocks Example
//Description: Shows handling different exceptions
// (ArrayIndexOutOfBoundsException and ArithmeticException) in one program.
public class Multiple_catch_blocks
{
    public static void main(String[] args)
    {
        String input= args[2];
        int b = Integer.parseInt(input);
        int d = 0;
        try
        {
            d = 20/b;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(d);


    }
}
