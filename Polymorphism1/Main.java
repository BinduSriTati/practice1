package Polymorphism1;

public class Main {
    public static void main(String[] args) {
        //double principal = 100000;

        SBI sbi = new SBI(10000,1);
        HDFC hdfc = new HDFC (150000,2);

        System.out.println("SBI Details:");
        sbi.displayDetails();

        System.out.println("HDFC Details:");
        hdfc.displayDetails();
    }
}
