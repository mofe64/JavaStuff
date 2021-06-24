package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observer {
    private String name;
    private int threshold;
    private List<String> sharesToBuy;
    private List<String> sharesToSell;

    public Customer(String name, int threshold) {
        this.name = name;
        this.threshold = threshold;
        sharesToBuy = new ArrayList<>();
        sharesToSell = new ArrayList<>();
    }

    public void addShareToBuy(String name) {
        sharesToBuy.add(name);

    }

    public void addShareToSell(String name) {
        sharesToSell.add(name);

    }

    public void sell() {
        System.out.println("Selling share now !!!");
    }

    public void buy() {
        System.out.println("buying shares now !!!");
    }


    @Override
    public void update(Share share) {
        System.out.println(name + " is being notified ...");
        if (sharesToBuy.contains(share.getName()) &&
                share.getValue() <= threshold) {
            buy();
            return;
        }
        if (sharesToSell.contains(share.getName()) &&
                share.getValue() >= threshold) {
            sell();
        }
    }
}
