package Polymorphism;

public class SBIClass extends RBIClass{
    @Override
    public double calculateInterest(int principleAmt) {
        double totalAmt=0;
        double InterestAmt= super.calculateInterest(principleAmt);
        totalAmt=InterestAmt+principleAmt;
        return totalAmt;

    }
    public double calculateInterest(int principleAmt,int days){
        double totalAmt=0;
        if(days<100) {
            return this.calculateInterest(principleAmt);
        }
           return totalAmt+principleAmt;


        }


}
