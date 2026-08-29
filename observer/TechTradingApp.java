package designPatterns.observer;

public class TechTradingApp extends Observer{
    
    public TechTradingApp(Subject publisher, String name){
        super(publisher, name, Sector.TECHNOLOGY, "\u001B[33m");
    }

}
