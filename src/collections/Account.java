package collections;

//public class Account implements Comparable<Account>
public class Account {
    private String firstname;
    private String lastname;
    private int balance;

    public Account(String firstname, String lastname, int balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//    @Override
//    public int compareTo(Account o) {
//        if (this.getBalance() > o.getBalance()) {
//            return 1;
//        } else if (this.getBalance() == o.getBalance()) {
//            return 0;
//        } else {
//            return -1;
//        }
//    }
}
