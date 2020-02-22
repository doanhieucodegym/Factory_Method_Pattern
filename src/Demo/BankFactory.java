package Demo;

import static Demo.BankType.TPBANK;

public class BankFactory {
    public BankFactory(){}
    public static Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new ImplTPBank();
            case VIETCOMBANK:
                return new ImplVietComBank();
            default:
                throw new IllegalArgumentException("This bank type is  unsupported");
        }
    }
}
