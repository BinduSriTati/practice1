package InterfaceDemo;

public class SBIBankService implements RBIBankService {
    @Override
    public String transfer(String FromAccountNumber, String ToAccountNumber, int amt) {
        return "transfer from SBIClass";
    }
}
