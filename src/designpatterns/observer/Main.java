package designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject apple = new Company("Apple Inc", 1200);
        Subject facebook = new Company("Facebook", 150);
        Observer customer1 = new Customer("Billy", 500);
        Observer customer2 = new Customer("Mofe", 1000);
        Observer customer3 = new Customer("Mongo", 200);
        customer1.addShareToBuy("Apple Inc");
        customer2.addShareToBuy("Apple Inc");
        customer3.addShareToBuy("Apple Inc");
        customer1.addShareToSell("Facebook");
        customer3.addShareToSell("Facebook");
        apple.registerObserver(customer1);
        apple.registerObserver(customer2);
        apple.registerObserver(customer3);
        facebook.registerObserver(customer1);
        facebook.registerObserver(customer3);


       apple.changeSharePrice(1750);
        System.out.println("=====================");
        facebook.changeSharePrice(280);

        System.out.println("===============");
        apple.removeObserver(customer2);
        apple.removeObserver(customer1);
        apple.removeObserver(customer3);
        apple.changeSharePrice(1750);

    }
}
