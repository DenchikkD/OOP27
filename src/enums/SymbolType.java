package enums;

/**
 * Created by Denni on 9/28/2016.
 */
public enum SymbolType {

    ACE(10),
    KING(9),
    QUIN(8);

    protected int number;

    SymbolType(int number) {
        this.number = number;
    }

    public int getCardNumber() {
        return number;
    }

    public static void main(String[] args) {
//        SymbolType.QUIN.name();
        SymbolType type = SymbolType.QUIN;
//        switch (type) {
//            case KING:
//                break;
//            case ACE:
//                break;
//            case QUIN:
//                break;
//        }
        System.out.println(type.getCardNumber());

    }


}
