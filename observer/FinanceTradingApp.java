package designPatterns.observer;

public class FinanceTradingApp extends Observer{
    
    public FinanceTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.FINANCE, "\u001B[35m");
    }

}
