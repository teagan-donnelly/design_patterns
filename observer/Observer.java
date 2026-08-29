package designPatterns.observer;

/**
 * Observer that watches stock changes for a specific sector
 * @author Teagan Donnelly
 */

public abstract class Observer {
    
    private String name;
    private Sector sector;
    private String color;

    /**
     * Creates an observer and registers it with the given publisher
     * @param publisher the subject being observed
     * @param name the name of the observer
     * @param sector the sector the observer monitors
     * @param color the color the observer will print as in the console
     */

    public Observer(Subject publisher, String name, Sector sector, String color){
        this.name = name;
        this.sector = sector;
        this.color = color;

        publisher.registerObserver(this);
    }

    /**
     * responds to a stock update if the stock is in this observer's sector
     * @param stock the stock that was being updated
     * @param direction the direction of the price change
     */
    public void update(Stock stock, Direction direction){
            if (stock.getSector() == sector) {

            String reset = "\u001B[0m";
            String directionColor;
            String arrow;

            if (direction == Direction.UP) {
                directionColor = "\u001B[32m"; //green for up
                arrow = "^";
            } else {
                directionColor = "\u001B[31m"; //red for down
                arrow = "v";
            }

            System.out.println(
                color + name.toUpperCase() + reset
                + ": " + stock.getCompanyName()
                + "(" + stock.getSymbol() + ") is now priced at "
                + directionColor + "$" + stock.getPrice()
                + " " + arrow + reset
            );
        }
    }
}
