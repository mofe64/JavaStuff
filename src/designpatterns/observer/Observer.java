package designpatterns.observer;

public interface Observer {
    void update(Share share);
    void addShareToSell(String name);
    void addShareToBuy(String name);
    public void sell();
    public void buy();
}
