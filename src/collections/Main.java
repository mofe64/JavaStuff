package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Collection<String> strings = new ArrayList<>();
//        strings.add("Hello");
//        strings.add("How");
//        strings.add("Are");
//        strings.add("You");
//
//        for (String value : strings){
//            System.out.println(value);
//        }
//
//        Iterator<String> stringIterator = strings.iterator();
//
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }
        Account account = new Account("Mofe", "Test", 100);
        Account account1 = new Account("David", "Shayo", 50);
        Account account2 = new Account("Hello", "Steve", 600);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account1);
        accounts.add(account2);
        AccountComparator accountComparator = new AccountComparator();
        Collections.sort(accounts, accountComparator);
        for (Account accountObj : accounts){
            System.out.println(accountObj.getFirstname());
        }
    }
}
