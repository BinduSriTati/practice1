package InterfaceDemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String FromAccountNumber, String ToAccountNumber, int amt) {
        return "transfer from HDFCBank";
    }
}
