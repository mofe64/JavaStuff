package designpatterns.observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Share price);

    public void changeSharePrice(int newPrice);
}
