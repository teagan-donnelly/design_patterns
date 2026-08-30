package designPatterns.observer;

/**
 * Defines the methods required for a Subject
 * Subject
 * @author Teagan Donnelly
 */
public interface Subject {

    /**
     * registers an observer with the subject
     * @param observer the observer to add
     */
    public void registerObserver(Observer observer);

    /**
     * removes an observer from a subject
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer);

    /**
     * notifies registered observers of a stock price change
     * @param stock the stock that was changed
     * @param direction whether the stock increased or decreased 
     */
    public void notifyObservers(Stock stock, Direction direction);
}
