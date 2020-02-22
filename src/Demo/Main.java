package Demo;

public class Main {
    public static void main(String[] args) {
        Bank bank =BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
    }
}
