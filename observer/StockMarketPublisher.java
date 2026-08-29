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
    
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void addStock(String symbol, String companyName, Sector sector, double price){
        Stock stock = new Stock(symbol, companyName, sector, price);
        stocks.put(symbol, stock);
    }

    public void updateStock(String symbol, double change){
        Stock stock = stocks.get(symbol);

        stock.updatePrice(change);

        if (change > 0) {
            notifyObservers(stock, Direction.UP);
        } else {
            notifyObservers(stock, Direction.DOWN);
        }
    }

    public void notifyObservers(Stock stock, Direction direction){
        for (Observer observer : observers) {
            observer.update(stock, direction);
        }  
    }


}
