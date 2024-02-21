package MethodOveriding;

public class BankAccountService {
    int i=20;
    int fromAccountAmt=100;
    int toAccountAmt=0;
    String fromAccount=null;
    String toAccount=null;
    boolean login(String username,String password){
       return true;
    }
    public boolean Transfer(String fromMobileNumber,String toMobileNumber,int amt){
        System.out.println("from superclass bankaccountservice");

        if(fromMobileNumber.equals("2345")){
            fromAccount="222";

        }
        if(toMobileNumber.equals("1234")) {
            toAccount="111";

        }
        return this.bookTransfer(fromAccount,toAccount,amt);
    }
    public boolean bookTransfer(String FromAccount,String ToAccount,int amt){
        toAccountAmt=toAccountAmt+amt;
        fromAccountAmt=fromAccountAmt-amt;
        return true;

    }
}
