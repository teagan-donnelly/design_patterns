package designPatterns.observer;

/**
 * 
 * FinanceTradingApp is an observer that watches changes in finance stocks
 * @author Teagan Donnelly
 */
public class FinanceTradingApp extends Observer{
    
    /**
     * creates a finance trading app the observes the given publisher
     * @param publisher the subject being observed
     * @param name the name of the trading app
     */
    public FinanceTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.FINANCE, "\u001B[35m");
    }

}
