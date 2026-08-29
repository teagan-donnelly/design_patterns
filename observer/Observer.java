package designPatterns.observer;

/**
 * Observer for different stocks
 * @author Teagan Donnelly
 */

public abstract class Observer {
    
    private String name;
    private Sector sector;
    private String color;

    public Observer(Subject publisher, String name, Sector sector, String color){
        this.name = name;
        this.sector = sector;
        this.color = color;

        publisher.registerObserver(this);
    }

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
