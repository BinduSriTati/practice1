package MethodOveriding;

public class MethodTest {
    public static void main(String[] args) {
        PhonePayService phonePayService=new PhonePayService();
        phonePayService.Transfer("94948","2444",23);
        phonePayService.Transfer("1234","345",100);
        System.out.println("To account number"+phonePayService.toAccount);
        BankAccountService bankAccountService=new BankAccountService();
        bankAccountService.Transfer("1235","5689",1000);
        BankAccountService bankAccountServiceUpcast=new PhonePayService();
        bankAccountServiceUpcast.Transfer("9876","6457",400);
        System.out.println(bankAccountService.i);

    }
}
