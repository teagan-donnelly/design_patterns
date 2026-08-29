package designPatterns.observer;

/**
 * 
 * represents a stock in the stock market
 * @author Teagan Donnelly
 */

public class Stock {
    private String symbol;
    private String companyName;
    private Sector sector;
    private double price;

    /**
     * creates a new stock with the given parameters
     * @param symbol the stock symbol
     * @param companyName the name of the company
     * @param sector the sector of the stock
     * @param price the price of the stock
     */

    public Stock(String symbol, String companyName, Sector sector, double price){
        this.symbol = symbol;
        this.companyName = companyName;
        this.sector = sector;
        this.price = price;
    }

    /**
     * Updates the stock price by the given amount
     * @param delta the change in price
     */
    public void updatePrice(double delta){
        price += delta;
    }

    /**
     * Gets the stock symbol
     * @return the stock symbol
     */
    public String getSymbol(){
        return symbol;
    }

    /**
     * gets the company name
     * @return the company name
     */
    public String getCompanyName(){
        return companyName;
    }

    /**
     * gets the sector of the stock
     * @return the sector
     */
    public Sector getSector(){
        return sector;
    }

    /**
     * gets the price of the stock
     * @return the stock price
     */
    public double getPrice(){
        return price;
    }


}
