package Tasks.Task_14thJune;

// Interface Constants
//🔶 Objective:
//Demonstrate how to use constants (public static final variables) in interfaces.
//🔶 Steps:
//Create an interface SpeedLimit with a constant MAX_SPEED = 120.
//In a class Car, access and print the constant.
//Do not modify the constant—it should behave like a final value.
//🔶 Expected Output:
//Max Speed is: 120
public class Interface_Constants implements  SpeedLimit{

    public static void main(String[] args) {
        Mycar mycar = new Mycar();
        mycar.ShowSpeedLimit();
    }

}

interface  SpeedLimit{
int MAX_SPEED = 120;
}


class Mycar implements SpeedLimit{
    public void ShowSpeedLimit(){
        System.out.println("Max speed is:" + MAX_SPEED);
    }
}