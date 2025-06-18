package Tasks.Task_12thJune.Super_Keyword;

//Use of super keyword Program

// Description: Use super to call parent class method.
public class Animal {
    void sound(){
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal {

    void  sound(){
        System.out.println("Dog Barks");
    }

    void display_sound(){
        super.sound();
        sound();
    }
}
