package decorator;

/**
 * 
 * @author Teagan Donnelly
 */
public class Armor extends GearAdder{
    
    Player player;

    public class Armor(Player player){
        this.player = player;
    }
}
