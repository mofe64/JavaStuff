package collections;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account account1, Account account2) {
        if (account1.getBalance() > account2.getBalance()) {
            return 1;
        } else if (account1.getBalance() == account2.getBalance()) {
            return 0;
        } else {
            return -1;
        }
    }
}
