package Demo;

public class Main {
    public static void main(String[] args) {
        Bank bank =BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());
    }
}
