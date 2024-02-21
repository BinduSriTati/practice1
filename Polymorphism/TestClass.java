package Polymorphism;

public class TestClass {
    public static void main(String[] args) {


        SBIClass sbiClass = new SBIClass();
        double sbiBankInterest = sbiClass.calculateInterest(100, 90);
        System.out.println("SBI Bank" + sbiBankInterest);
        HDFCClass hdfcClass = new HDFCClass();
        double hdfcBankInterset = hdfcClass.calculateInterest(200, 80);
        System.out.println("hdfc Interest" + hdfcBankInterset);

    }
}
