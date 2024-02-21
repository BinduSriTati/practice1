package Polymorphism;

public class HDFCClass extends RBIClass {
    @Override
    public double calculateInterest(int principleAmt) {
        double totalAmt=0;
        double interestAmt= super.calculateInterest(principleAmt);
        totalAmt=interestAmt+principleAmt;
        return totalAmt;
    }
    public double calculateInterest(int principleAmt,int days){
        double totalAmt=0;
        if(days>89) {
            return this.calculateInterest(principleAmt);
        }
            return totalAmt+principleAmt;




















        }
}
