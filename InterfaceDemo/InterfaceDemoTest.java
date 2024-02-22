package InterfaceDemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService HDFC=new HDFCBankService();
        RBIBankService SBI=new SBIBankService();
       String HDFCStatus=HDFC.transfer("111","222",50);
       String SBIStatus=SBI.transfer("333","444",100);
        System.out.println(HDFCStatus);
        System.out.println(SBIStatus);
    }
}
