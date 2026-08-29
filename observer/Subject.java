package designPatterns.observer;


public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(Stock stock, Direction direction);
}
