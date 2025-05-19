package Tasks;

public class Task_19thMay_Classified_Triangle_Based_On_Length {
    public static void main(String[] args) {
        int n1=100;
        int n2=100;
        int n3=100;

        if(n1==n2 && n2 ==n3){

            System.out.println("This Triangle is equilateral");
        } else if (n1==n2 || n2==n3 || n1==n3) {

            System.out.println("This Triangle is isosceles");
            
        }
        else {
            System.out.println("This Triangle is scalene");
        }


    }
}
