package MethodOveriding;

public class PhonePayService extends BankAccountService{
    int i=10;
    String FromMobileNumber;
    String ToMobileNumber;
    int amt;

    public boolean Transfer(String fromMobileNumber,String toMobileNumber,int amt ){
        return  super.Transfer(fromMobileNumber,toMobileNumber,amt);
    }


}
