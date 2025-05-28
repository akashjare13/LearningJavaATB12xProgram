package Tasks;

import javax.xml.transform.Source;

public class Task_19thMay_Classified_Triangle_Based_On_Length {
    public static void main(String[] args) {
        int n1=2;
        int n2=1;
        int n3=0;

        if(n1 > 0 && n2 > 0 && n3 > 0 && n1+n2>n3 && n1+n3>n2 && n2+n3>n1) {
            if (n1 == n2 && n2 == n3) {

                System.out.println("This Triangle is equilateral");
            } else if (n1 == n2 || n2 == n3 || n1 == n3) {

                System.out.println("This Triangle is isosceles");

            } else {
                System.out.println("This Triangle is scalene");
            }
        }
        else {
            System.out.println("It's Not a Traiangle");
        }


    }
}
