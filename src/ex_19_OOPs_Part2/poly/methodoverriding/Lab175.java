package ex_19_OOPs_Part2.poly.methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Akash p = new Akash();
        p.home();
        p.p1();

        Father f1 = new Father();
        f1.home();
        f1.f1();

        Father f2 = new Akash();
        f2.home();


    }
}
