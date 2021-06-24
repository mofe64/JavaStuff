package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Company implements Subject {
    private String name;
    private List<Observer> customers;
    Share share;

    public Company(String name, int startValue) {
        this.customers = new ArrayList<>();
        share = new Share(name, startValue);
    }

    @Override
    public void registerObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObserver(Share share) {
        customers.forEach(observer -> {
            observer.update(share);
        });
    }
    public void changeSharePrice(int newPrice){
        share.setValue(newPrice);
        notifyObserver(share);
    }
}
