package Tasks.Task_14thJune;

//Interface Polymorphism
//🔶 Objective:
//Learn how interfaces support polymorphism –
// calling the same method on different implementations.
//🔶 Steps:
//Create an interface Playable with method play().
//Create two classes: Guitar and Piano, both implement Playable.
//Implement the play() method in both classes with different messages.
//In main(), declare a reference of type Playable and assign
// it objects of Guitar and Piano one by one.

//Call play() on each.
//🔶 Expected Output:
//Playing Guitar
//Playing Piano
public class Interface_Polymorphism {
    public static void main(String[] args) {
        Playable p1 = new Guitar();
        p1.play();
        Playable p2 = new Piano();
        p2.play();

    }
}
interface Playable{
     void play();
}

class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements  Playable{
    public void play(){
        System.out.println("Playing Piano");
    }
}
