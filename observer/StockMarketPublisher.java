package designPatterns.observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * StockMarketPublisher manages stocks and notifies observers when
 * there is a change in stock price
 * @author Teagan Donnelly
 */
public class StockMarketPublisher implements Subject {
    
    private ArrayList<Observer> observers = new ArrayList<>();
    private HashMap<String, Stock> stocks = new HashMap<>();
    
    /**
     * Registers an observer to get stock updates
     * @param observer the observer to register
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * removes an observer from getting stock updates
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * creates a new stock with the given information and adds
     * it to the HashMap of stocks
     * @param symbol the symbol of the stock
     * @param companyName the name of the company
     * @param sector the sector of the stock
     * @param price the current price of the stock
     */
    public void addStock(String symbol, String companyName, Sector sector, double price){
        Stock stock = new Stock(symbol, companyName, sector, price);
        stocks.put(symbol, stock);
    }

    /**
     * Determines if the price went up or down and sets the direction accordingly
     * @param symbol the symbol of the stock
     * @param change the amount of change in price a stock has
     */
    public void updateStock(String symbol, double change){
        Stock stock = stocks.get(symbol);

        stock.updatePrice(change);

        if (change > 0) {
            notifyObservers(stock, Direction.UP);
        } else {
            notifyObservers(stock, Direction.DOWN);
        }
    }

    /**
     * Notifies all registered observers when a stock's price changes
     * @param stock the stock that was changed
     * @param direction whether the stock price went up or down
     */
    public void notifyObservers(Stock stock, Direction direction){
        for (Observer observer : observers) {
            observer.update(stock, direction);
        }  
    }


}
