package Tasks.Task_14thJune;
//Bank Interest Calculation
//Description: Abstract class Bank with abstract method getInterestRate().
// Classes SBI and HDFC implement it.
//🔶 Expected Output:
//SBI Interest Rate: 6.5%
//HDFC Interest Rate: 7.0%

public class Bank_Interest_Calculation {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        sbi.getInterestRate();
        hdfc.getInterestRate();

        System.out.println("SBI Interest Rate: "+ sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: "+ hdfc.getInterestRate() + "%");

    }
}
abstract class Bank{
    abstract double getInterestRate();
}
class SBI extends Bank {
    @Override
    double getInterestRate(){
        return 6.5;
    }
}

class HDFC extends Bank{
    @Override
    double getInterestRate() {
        return 7.0;
    }
}