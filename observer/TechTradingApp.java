package designPatterns.observer;

/**
 * 
 * TechTradingApp is an observer that monitors tech stocks
 * @author Teagan Donnelly
 */
public class TechTradingApp extends Observer{
    
    /**
     * creates a tech trading app that observes the given publisher
     * @param publisher the name of the subject being observed 
     * @param name the name of the trading app
     */
    public TechTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.TECHNOLOGY, "\u001B[33m");
    }

}
