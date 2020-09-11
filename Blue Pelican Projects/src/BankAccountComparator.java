import java.util.*;

public class BankAccountComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BankAccount ba1 = (BankAccount) o1;
        BankAccount ba2 = (BankAccount) o2;

        if (ba1.balance > ba2.balance) {
            return 1;
        }
        else if (ba1.balance < ba2.balance) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
